package com.starostin.shop2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CategorySelectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_selection)

        val buttonCategory1: Button = findViewById(R.id.buttonCategory1)
        val buttonCategory2: Button = findViewById(R.id.buttonCategory2)
        val buttonCategory3: Button = findViewById(R.id.buttonCategory3)

        buttonCategory1.setOnClickListener {
            val intent = Intent(this, ItemsActivity::class.java)
            startActivity(intent)
        }

        buttonCategory2.setOnClickListener {
            val intent = Intent(this, ItemsActivity2::class.java)
            startActivity(intent)
        }

        buttonCategory3.setOnClickListener {
            val intent = Intent(this, ItemsActivity3::class.java)
            startActivity(intent)
        }
    }
}
