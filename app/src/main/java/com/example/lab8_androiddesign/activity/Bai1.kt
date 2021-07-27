package com.example.lab8_androiddesign.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.example.lab8_androiddesign.R
import com.example.lab8_androiddesign.adapter.MenuAdapter
import com.example.lab8_androiddesign.fragment.*
import com.example.lab8_androiddesign.model.ItemMenu
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_bai1.*

class Bai1 : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai1)

        setSupportActionBar(toolbar_bai1)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val toggle = ActionBarDrawerToggle(
            this,
            drawerlayout_bai1,
            toolbar_bai1,
            R.string.navigation_open,
            R.string.navigation_close
        )
        drawerlayout_bai1.addDrawerListener(toggle)
        toggle.syncState()

        navigation_view_bai1.setNavigationItemSelectedListener { item: MenuItem ->
            when (item.itemId) {
                R.id.nav_first ->
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame_layout_bai1, FragmentFirst()).commit()
                R.id.nav_second -> supportFragmentManager.beginTransaction()
                    .replace(R.id.frame_layout_bai1, FragmentSecond()).commit()
                R.id.nav_third -> supportFragmentManager.beginTransaction()
                    .replace(R.id.frame_layout_bai1, FragmentThird()).commit()
                R.id.nav_fourth -> supportFragmentManager.beginTransaction()
                    .replace(R.id.frame_layout_bai1, FragmentFourth()).commit()
                R.id.nav_fifth -> supportFragmentManager.beginTransaction()
                    .replace(R.id.frame_layout_bai1, FragmentFifth()).commit()
            }
            drawerlayout_bai1.closeDrawer(GravityCompat.START)
            true
        }

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frame_layout_bai1, FragmentFirst()).commit()
            navigation_view_bai1.setCheckedItem(R.id.nav_first)
        }
    }

    override fun onBackPressed() {
        if (drawerlayout_bai1.isDrawerOpen(GravityCompat.START)) {
            drawerlayout_bai1.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return true
    }

}