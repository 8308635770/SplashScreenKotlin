package com.example.splashscreenkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed(object:Runnable{
            override fun run() {

                val i=Intent(applicationContext,MainActivity::class.java)

                startActivity(Intent(this@SplashActivity,MainActivity::class.java))
                finish()
            }

        },5000)
    }
}
