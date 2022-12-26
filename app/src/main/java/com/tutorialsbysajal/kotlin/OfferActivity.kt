package com.tutorialsbysajal.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class OfferActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_offer)
        val userName  = intent.getStringExtra("USER")
        val tvOfferText = findViewById<TextView>(R.id.tvOfferText)
        val greetText = "Hi $userName, you are now a premium customar of our application..... "
        tvOfferText.text = greetText
    }
}