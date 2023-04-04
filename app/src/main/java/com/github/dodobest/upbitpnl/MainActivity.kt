package com.github.dodobest.upbitpnl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.dodobest.upbitpnl.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}