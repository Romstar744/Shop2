package com.starostin.shop2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

private const val DEVELOPER_EMAIL = "romstar744@gmail.com"
class FeedbackActivity : AppCompatActivity() {

    private lateinit var editTextReview: EditText
    private lateinit var ratingBar: RatingBar
    private lateinit var editTextComment: EditText
    private lateinit var buttonSubmit: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)

        val ButtonShop: TextView = findViewById(R.id.link_to_shop)

        editTextReview = findViewById(R.id.editTextReview)
        ratingBar = findViewById(R.id.ratingBar)
        editTextComment = findViewById(R.id.editTextComment)
        buttonSubmit = findViewById(R.id.buttonSubmit)

        ButtonShop.setOnClickListener {
            val intent = Intent (this, CategorySelectionActivity::class.java)
            startActivity(intent)
        }

        buttonSubmit.setOnClickListener {
            val review = editTextReview.text.toString()
            val rating = ratingBar.rating.toInt()
            val comment = editTextComment.text.toString()
            if (review.isNotEmpty() && rating > 0) {
                val intent = Intent(Intent.ACTION_SENDTO).apply {
                    data = Uri.parse("mailto:")
                    putExtra(Intent.EXTRA_EMAIL, arrayOf(DEVELOPER_EMAIL))
                    putExtra(Intent.EXTRA_SUBJECT, "Отзыв от пользователя")
                    putExtra(Intent.EXTRA_TEXT, "Оценка: $rating\n$review\n$comment")
                }
                if (intent.resolveActivity(packageManager)!= null) {
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Нет приложения для отправки электронной почты", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
