package com.dwell.communitymanagement.Splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.dwell.communitymanagement.Login.LoginActivity
import com.dwell.communitymanagement.R
import com.dwell.communitymanagement.Utils.user


class SplashScreen : AppCompatActivity() {

    private val SPLASH_TIME_OUT : Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Handler().postDelayed(
            Runnable
            /*
                * Showing splash screen with a timer. This will be useful when you
                * want to show case your app logo / company
                */
            { // This method will be executed once the timer is over
                // Start your app main activity
                if (user==false){
                    val i = Intent(this@SplashScreen, OnboardingActivity::class.java)
                    startActivity(i)
                }else{
                    val i = Intent(this@SplashScreen, LoginActivity::class.java)
                    startActivity(i)
                }

                // close this activity
                finish()
            }, SPLASH_TIME_OUT)

    }
}