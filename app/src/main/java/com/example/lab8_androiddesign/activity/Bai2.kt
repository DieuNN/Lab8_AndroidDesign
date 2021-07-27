package com.example.lab8_androiddesign.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.lab8_androiddesign.R
import com.example.lab8_androiddesign.adapter.RecyclerAdapter
import com.example.lab8_androiddesign.model.ItemMenu
import kotlinx.android.synthetic.main.activity_bai2.*
import kotlinx.android.synthetic.main.card_view.*

class Bai2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai2)

        val layoutManager:RecyclerView.LayoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerview_bai2.layoutManager = layoutManager

        val list:ArrayList<ItemMenu> = ArrayList()
        list.add(ItemMenu("Doge 1", R.drawable.doge1))
        list.add(ItemMenu("Doge 2", R.drawable.doge_2))
        list.add(ItemMenu("Doge 3", R.drawable.doge3))
        list.add(ItemMenu("Doge 1", R.drawable.doge1))
        list.add(ItemMenu("Doge 2", R.drawable.doge_2))
        list.add(ItemMenu("Doge 3", R.drawable.doge3))
        list.add(ItemMenu("Doge 1", R.drawable.doge1))
        list.add(ItemMenu("Doge 2", R.drawable.doge_2))
        list.add(ItemMenu("Doge 3", R.drawable.doge3))

        recyclerview_bai2.adapter = RecyclerAdapter(list)
    }
}