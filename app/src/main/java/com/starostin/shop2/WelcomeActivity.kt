package com.starostin.shop2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.starostin.shop2.CartManager

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val buttonCategory: Button = findViewById(R.id.button_reg)


        buttonCategory.setOnClickListener{
            val intent = Intent(this, CategorySelectionActivity::class.java)
            startActivity(intent)
        }
    }
}
