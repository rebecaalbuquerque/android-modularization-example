package com.example.bbb.navigation

import android.content.Context
import android.content.Intent
import com.example.bbb.BbbActivity
import com.example.navigation.bbb.BbbNavigation

class BbbNavigationImpl : BbbNavigation {

    override fun navigateToBbb(context: Context) {
        val intent = Intent(context, BbbActivity::class.java)
        context.startActivity(intent)
    }
}