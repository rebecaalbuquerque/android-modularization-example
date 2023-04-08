package com.example.bbb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bbb.databinding.ActivityBbbBinding

class BbbActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBbbBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBbbBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}