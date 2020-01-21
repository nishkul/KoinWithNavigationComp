package com.example.myapplicationblank

import android.content.Context
import android.content.SharedPreferences


class AppPreferences(context: Context) {
    private val preferences: SharedPreferences = context.getSharedPreferences("prefs", Context.MODE_PRIVATE)
    private val isShown = "isShown"

    fun storeShouldShow(shouldShow: Boolean) {
        preferences.edit().putBoolean(isShown, shouldShow).commit()
    }

    fun getShouldShow():Boolean {
    return    preferences.getBoolean(isShown, false)
    }
}