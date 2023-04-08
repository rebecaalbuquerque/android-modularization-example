package com.example.ccc.navigation

import android.content.Context
import android.content.Intent
import com.example.ccc.CccActivity
import com.example.navigation.ccc.CccNavigation

class CccNavigationImpl : CccNavigation {

    override fun navigateToCcc(context: Context) {
        val intent = Intent(context, CccActivity::class.java)
        context.startActivity(intent)
    }
}