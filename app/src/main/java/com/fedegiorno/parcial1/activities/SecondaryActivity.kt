/*
Desarrollo de Aplicaciones para Dispositivos Moviles
PRIMER PARCIAL
Temas: BottomNavigationBars, NavigationDrawer, Tabs, Preferences y Splash

SecundaryActivity.kt
Ubicacion: com.fedegiorno.parcial1.activities

Esta activity mostrara el uso de NavigationDrawer
 */

package com.fedegiorno.parcial1.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.fedegiorno.parcial1.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class SecondaryActivity : AppCompatActivity() {

    private lateinit var bottomNavView : BottomNavigationView
    private lateinit var navHostFragment : NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        navHostFragment = supportFragmentManager.findFragmentById(R.id.NavHostSecondary) as NavHostFragment

        bottomNavView = findViewById(R.id.Bottom_Bar)

        NavigationUI.setupWithNavController(bottomNavView, navHostFragment.navController)

    }
}