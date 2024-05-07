package com.starostin.shop2

    import android.content.Intent
    import android.os.Bundle
    import android.widget.ImageView
    import androidx.appcompat.app.AppCompatActivity
    import androidx.recyclerview.widget.LinearLayoutManager
    import androidx.recyclerview.widget.RecyclerView

    class ItemsActivity3 : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_items3)

            val itemsList: RecyclerView = findViewById(R.id.itemsList3)
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

            items.add(Item(5, "kraken", "Игровой наушники Razer", "Razer Kraken",
                "Игровые наушники Razer Kraken обеспечивают высокое качество звука и комфорт во время длительных игровых сессий.", 3499))

            itemsList.layoutManager = LinearLayoutManager(this)
            itemsList.adapter = ItemsAdapter(items, this)
        }
}
