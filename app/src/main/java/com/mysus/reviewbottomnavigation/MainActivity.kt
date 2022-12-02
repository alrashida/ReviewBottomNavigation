package com.mysus.reviewbottomnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //step 1
        val menagefragment : NavHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView4) as NavHostFragment? ?: return
        //step 2
        val navHostController = menagefragment.navController
        //step 3
        val bottomNavigationView2 : BottomNavigationView = findViewById(R.id.bottom_navigation)

        bottomNavigationView2.setupWithNavController(navHostController)

    }
}