package com.fedegiorno.parcial1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT:Long = 3000     // 3 segundos

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed(

            {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
            , SPLASH_TIME_OUT)
    }
}