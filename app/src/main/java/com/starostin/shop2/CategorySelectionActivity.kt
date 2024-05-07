package com.starostin.shop2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class CategorySelectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_selection)

        val buttonCategory1: Button = findViewById(R.id.buttonCategory1)
        val buttonCategory2: Button = findViewById(R.id.buttonCategory2)
        val buttonCategory3: Button = findViewById(R.id.buttonCategory3)
        val buttonCart: ImageView = findViewById(R.id.buttonCart)
        val buttonAuth: ImageView = findViewById(R.id.link_to_auth)


        buttonCategory1.setOnClickListener {
            val intent = Intent(this, ItemsActivity::class.java)
            intent.putExtra("category", 1)
            startActivity(intent)
        }

        buttonCategory2.setOnClickListener {
            val intent = Intent(this, ItemsActivity2::class.java)
            intent.putExtra("category", 2)
            startActivity(intent)
        }

        buttonCategory3.setOnClickListener {
            val intent = Intent(this, ItemsActivity3::class.java)
            intent.putExtra("category", 3)
            startActivity(intent)
        }

        buttonCart.setOnClickListener {
            val intent = Intent(this, CartActivity::class.java)
            startActivity(intent)
        }
        buttonAuth.setOnClickListener {
            val intent = Intent(this, AuthActivity::class.java)
            startActivity(intent)
        }
    }
}
