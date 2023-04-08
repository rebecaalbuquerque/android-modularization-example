package com.example.aaa.navigation

import android.content.Context
import android.content.Intent
import com.example.aaa.AaaActivity
import com.example.navigation.aaa.AaaNavigation

class AaaNavigationImpl : AaaNavigation {

    override fun navigateToAaa(context: Context) {
        val intent = Intent(context, AaaActivity::class.java)
        context.startActivity(intent)
    }
}