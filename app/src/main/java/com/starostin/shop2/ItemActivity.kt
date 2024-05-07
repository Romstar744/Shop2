package com.starostin.shop2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.starostin.shop2.CartManager

class ItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)

        val title: TextView = findViewById(R.id.item_list_title_one)
        val text: TextView = findViewById(R.id.item_list_text)
        val linkToPrevious: Button = findViewById(R.id.button_buy)

        val itemTitle = intent.getStringExtra("itemTitle")
        val itemText = intent.getStringExtra("itemText")
        val itemId = intent.getIntExtra("itemId", -1)
        val itemPrice = intent.getIntExtra("itemPrice", 0)

    linkToPrevious.setOnClickListener{
        finish()
    }


        title.text = itemTitle
        text.text = itemText
    }
}
