package com.tutorialsbysajal.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val evName = findViewById<EditText>(R.id.etName)
        val bnSubmit = findViewById<Button>(R.id.bnSubmit)
        val evGreet = findViewById<TextView>(R.id.evGreet)
        val btnOffer = findViewById<Button>(R.id.btnOffer)
        var userName =""
        bnSubmit.setOnClickListener {
            btnOffer.visibility = INVISIBLE
            userName = evName.text.toString()
            val greetMessage = "Hello $userName"
            if (userName == "") {
                evGreet.text=""
                Toast.makeText(
                    applicationContext,
                    "Plese enter your name",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                btnOffer.visibility = VISIBLE
                evName.text.clear()
                evGreet.text = greetMessage
            }
        }
        btnOffer.setOnClickListener {
            val intent = Intent(this@MainActivity,OfferActivity::class.java)
            intent.putExtra("USER",userName)
            startActivity(intent)
        }

    }
}