package com.example.lab8_androiddesign.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.lab8_androiddesign.R
import com.example.lab8_androiddesign.model.ItemMenu
import kotlinx.android.synthetic.main.item_row.view.*

class MenuAdapter(context: Context, resource: Int, list: MutableList<ItemMenu>) :
    ArrayAdapter<ItemMenu>(context, resource, list) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(context).inflate(R.layout.item_row, null)

        view.image_view_item_row.setImageResource(getItem(position)!!.icon!!)
        view.text_view_item_row.text = getItem(position)!!.name

        return view
    }
}