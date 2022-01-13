package com.example.devportfolio

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devportfolio.controller.DevPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //this will be supported only for ViewPager not for ViewPager2
        viewPager.adapter = DevPagerAdapter(supportFragmentManager)
        tabLayoutID.setupWithViewPager(viewPager)
        tabLayoutID.setTabTextColors(Color.BLACK, Color.WHITE)
    }
}