package com.example.cataloghw.services

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.example.cataloghw.databinding.ActivityHomeBinding
import com.example.cataloghw.R
import com.example.cataloghw.fragments.GridFragment
import com.example.cataloghw.fragments.GridFragmentDirections
import com.example.cataloghw.fragments.LinearFragment
import com.example.cataloghw.fragments.LinearFragmentDirections
import com.example.cataloghw.services.SharedPref

class HomeActivity : androidx.appcompat.app.AppCompatActivity(){
    lateinit var bottomNav: BottomNavigationView

    override fun onCreate(saveInstanceState: Bundle?){
        super.onCreate(saveInstanceState)
        setContentView(R.layout.activity_home)

        bottomNav.setOnNavigationItemSelectedListener {item ->
            when(item.itemId){
                R.id.linearFragment_bn -> {
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container_home, LinearFragment()).commit()
                }

                R.id.gridFragment_bn -> {
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container_home, GridFragment()).commit()
                }
            }
            true
        }

    }

}