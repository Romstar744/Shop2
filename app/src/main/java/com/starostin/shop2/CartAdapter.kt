package com.starostin.shop2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CartAdapter(private val cartItems: MutableList<Item>) : RecyclerView.Adapter<CartAdapter.CartViewHolder>() {

    inner class CartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemNameTextView: TextView = itemView.findViewById(R.id.cart_item_title)
        val itemPriceTextView: TextView = itemView.findViewById(R.id.cart_item_price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.cart_item, parent, false)
        return CartViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        val currentItem = cartItems[position]
        holder.itemNameTextView.text = currentItem.title
        holder.itemPriceTextView.text = "${currentItem.price}₽"

    }

    override fun getItemCount(): Int {
        return cartItems.size
    }

    private fun removeItem(position: Int) {
        cartItems.removeAt(position)
        notifyDataSetChanged()
    }
}

