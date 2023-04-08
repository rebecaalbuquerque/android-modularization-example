package com.example.aaa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aaa.databinding.ActivityAaaBinding

class AaaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAaaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAaaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}