package com.starostin.shop2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

// CartActivity.kt
class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val cartItemsRecyclerView: RecyclerView = findViewById(R.id.cartItemsRecyclerView)
        val cartItems = CartManager.getCartItems()

        val adapter = CartItemsAdapter(cartItems)
        cartItemsRecyclerView.adapter = adapter
        cartItemsRecyclerView.layoutManager = LinearLayoutManager(this)
    }
}
