package com.example.orderingg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btnhotel.setOnClickListener {
            val hotel_intent = Intent(this, HotelList::class.java)
            startActivity(hotel_intent)
        }
    }
}