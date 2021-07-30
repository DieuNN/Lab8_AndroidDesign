package com.example.lab8_androiddesign.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.lab8_androiddesign.R
import com.example.lab8_androiddesign.R.id.text_view_card_view_bai2
import com.example.lab8_androiddesign.model.ItemMenu

class RecyclerAdapter(private val context: Context, private val list: ArrayList<ItemMenu>) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view, null)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.image.setImageResource(list[position].icon!!)
        holder.des.text = list[position].name
        holder.des.background.alpha = 0.8.toInt()

        holder.image.setOnClickListener {
            Toast.makeText(context, "You clicked ${position + 1} image", Toast.LENGTH_SHORT).show()
        }

        holder.like.setOnClickListener {
            Toast.makeText(context, "Liked image ${position + 1}", Toast.LENGTH_SHORT).show()
        }

        holder.share.setOnClickListener {
            Toast.makeText(context, "Shared image${position + 1}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView = itemView.findViewById(R.id.image_view_card_view_bai2)
        var des: TextView = itemView.findViewById(text_view_card_view_bai2)
        var like: ImageView = itemView.findViewById(R.id.button_fav_cardview_bai2)
        var share: ImageView = itemView.findViewById(R.id.button_share_cardview_bai2)

    }
}