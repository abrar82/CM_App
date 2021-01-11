package com.dwell.communitymanagement.Login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.dwell.communitymanagement.R
import com.facebook.FacebookSdk
import com.facebook.login.widget.LoginButton
import com.google.android.gms.common.SignInButton

class LoginActivity : AppCompatActivity() {
    private lateinit var login_btn: Button
    private lateinit var fb_login : LoginButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.activity_login)
        login_btn = findViewById(R.id.otp_btn)

        val gSignIn = findViewById<View>(R.id.google_signin) as SignInButton

        fb_login = findViewById(R.id.facebook_signin)
        login_btn.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        }
        fb_login.setOnClickListener {
            Toast.makeText(this,"Coming Soon!!!",Toast.LENGTH_SHORT).show()
        }
        gSignIn.setOnClickListener {
            Toast.makeText(this,"Coming Soon!!!",Toast.LENGTH_SHORT).show()
        }
    }
}