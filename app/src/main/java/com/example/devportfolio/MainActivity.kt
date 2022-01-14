package com.example.devportfolio

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devportfolio.controller.DevPagerAdapter
import com.example.devportfolio.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //this will be supported only for ViewPager not for ViewPager2
        viewPager.adapter = DevPagerAdapter(supportFragmentManager)
        GlobalScope.launch {
            tabLayoutID.setupWithViewPager(viewPager)
            tabLayoutID.setTabTextColors(Color.BLACK, Color.WHITE)
        }

    }
}