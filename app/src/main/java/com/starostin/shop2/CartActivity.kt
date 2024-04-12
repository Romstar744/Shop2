package com.starostin.shop2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CartActivity : AppCompatActivity() {
    private lateinit var cartRecyclerView: RecyclerView
    private lateinit var totalPriceTextView: TextView
    private lateinit var cartItems: MutableList<Item>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        cartRecyclerView = findViewById(R.id.cartRecyclerView)
        cartRecyclerView.layoutManager = LinearLayoutManager(this)

        cartItems = CartManager.getCartItems().toMutableList()

        val cartAdapter = CartAdapter(cartItems)
        cartRecyclerView.adapter = cartAdapter

        totalPriceTextView = findViewById(R.id.totalPriceTextView)
        updateTotalPrice()
    }

    private fun updateTotalPrice() {
        var totalPrice = 0.0
        for (item in cartItems) {
            totalPrice += item.price
        }
        totalPriceTextView.text = "Total: $$totalPrice"
    }
}

