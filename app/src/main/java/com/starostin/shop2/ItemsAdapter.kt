package com.starostin.shop2

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.starostin.shop2.CartManager
import com.starostin.shop2.Item
import com.starostin.shop2.ItemActivity
import com.starostin.shop2.R

class ItemsAdapter(private val items: List<Item>, private val context: Context) : RecyclerView.Adapter<ItemsAdapter.MyViewHolder>() {

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.item_list_image)
        val title: TextView = view.findViewById(R.id.item_list_title)
        val desc: TextView = view.findViewById(R.id.item_list_desc)
        val price: TextView = view.findViewById(R.id.item_list_price)
        val viewButton: Button = view.findViewById(R.id.item_list_button)
        val buyButton: Button = view.findViewById(R.id.item_list_buy_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_in_list, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = items[position]

        holder.title.text = currentItem.title
        holder.desc.text = currentItem.desc
        holder.price.text = "${currentItem.price}₽"

        val imageId = context.resources.getIdentifier(
            currentItem.image,
            "drawable",
            context.packageName
        )
        holder.image.setImageResource(imageId)

        holder.viewButton.setOnClickListener {
            val intent = Intent(context, ItemActivity::class.java)
            intent.putExtra("itemTitle", currentItem.title)
            intent.putExtra("itemText", currentItem.text)
            context.startActivity(intent)
        }

        holder.buyButton.setOnClickListener {
            CartManager.addToCart(currentItem)
        }
    }
}
