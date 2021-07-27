package com.example.lab8_androiddesign.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lab8_androiddesign.R
import com.example.lab8_androiddesign.R.id.text_view_card_view_bai2
import com.example.lab8_androiddesign.model.ItemMenu

class RecyclerAdapter(list:ArrayList<ItemMenu>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private val listSize = list.size
    private val list = list

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view, null)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.image.setImageResource(list.get(position).icon!!)
        holder.des.text = list.get(position).name
        holder.des.background.alpha = 0.8.toInt()
    }

    override fun getItemCount(): Int {
        return listSize
    }

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var image: ImageView
        var des: TextView
        var like:ImageView
        var share:ImageView

        init {
            image  = itemView.findViewById(R.id.image_view_card_view_bai2)
            des = itemView.findViewById(text_view_card_view_bai2)
            like = itemView.findViewById(R.id.button_fav_cardview_bai2)
            share = itemView.findViewById(R.id.button_share_cardview_bai2)
        }
    }
}