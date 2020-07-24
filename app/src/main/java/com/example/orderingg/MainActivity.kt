package com.example.orderingg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSignIn.setOnClickListener{
            val signin_intent = Intent(this, SecondActivity::class.java)
            startActivity(signin_intent)


         btnSignUp.setOnClickListener{
             val signup_intent = Intent(this, SecondActivity::class.java)
             startActivity(signup_intent)
         }
        }
    }
}