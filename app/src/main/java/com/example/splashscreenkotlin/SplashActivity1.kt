package com.example.splashscreenkotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.TranslateAnimation
import androidx.core.view.marginStart
import androidx.core.view.marginTop
import androidx.core.view.setPadding
import gr.net.maroulis.library.EasySplashScreen

class SplashActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_splash1)

        val config = EasySplashScreen(this@SplashActivity1)
            .withAfterLogoText("After LOGO Text")
            .withBackgroundColor(Color.RED)
            .withBeforeLogoText("Befor LOGO Text")
            .withLogo(R.drawable.alti_logo)
            .withHeaderText("Header")
            .withFooterText("Footer")
            .withSplashTimeOut(2000)
            .withTargetActivity(MainActivity::class.java)
            .withFullScreen()

        config.headerTextView.setTextSize(1,15f)
//        config.headerTextView.setTextColor(Color.RED)

        myCustomTextViewAnimation(config.headerTextView)

        val view =config.create()


        setContentView(view)
    }

    private fun myCustomTextViewAnimation(view:View){

        val animation = TranslateAnimation(0.0F, 0F, 480F, 0F);
        animation.duration=1200
        view.startAnimation(animation)


    }
}
