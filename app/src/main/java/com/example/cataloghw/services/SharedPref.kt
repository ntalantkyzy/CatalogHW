package com.example.cataloghw.services


import android.content.Context
import android.content.SharedPreferences

class SharedPref (context: Context){

private val APP_NAME = "SharedPref"
private val pref: SharedPreferences

init {
    pref = context.getSharedPreferences(APP_NAME, Context.MODE_PRIVATE)
}
var login: String?
get() = pref.getString("login",null)
set(value) = pref.edit().putString("login", value).apply()

var password: String?
get() = pref.getString("password",null)
set(value) = pref.edit().putString("password",value).apply()
}
