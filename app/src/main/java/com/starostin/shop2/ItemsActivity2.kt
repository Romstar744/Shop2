package com.starostin.shop2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items2)

        val itemsList: RecyclerView = findViewById(R.id.itemsList2)
        val items = arrayListOf<Item>()
        val back: ImageView = findViewById(R.id.back)
        val basket: ImageView = findViewById(R.id.basket)

        back.setOnClickListener {
            finish()
        }
        basket.setOnClickListener {
            val intent = Intent(this, CartActivity::class.java)
            startActivity(intent)
        }

        items.add(Item(4, "carbon", "Игровая клавиатура Logitech", "Logitech G413",
            "Игровая клавиатура Logitech G413 Carbon - это мощный инструмент для вашей игровой сессии. " +
                    "Она предлагает высокую производительность и удобное использование.", 5999))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)
    }
}
