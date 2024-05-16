package com.starostin.shop2

object CartManager {
    private val cartItems = mutableListOf<Item>()

    fun addToCart(item: Item) {
        cartItems.add(item)
    }

    fun removeFromCart(item: Item) {
        cartItems.remove(item)
    }

    fun getCartItems(): List<Item> {
        return cartItems.toList()
    }

    fun saveCartItems(items: List<Item>) {
    }

    fun getTotalPrice(): Int {
        var totalPrice = 0
        for (item in cartItems) {
            totalPrice += item.price
        }
        return totalPrice
    }

    fun clearCart() {
        cartItems.clear()
    }
}
