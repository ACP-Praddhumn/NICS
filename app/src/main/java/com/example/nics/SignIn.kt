package com.example.nics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val btntosignUp = findViewById<TextView>(R.id.btntosignUp)

        btntosignUp.setOnClickListener {

            val intent = Intent(this, SignUp::class.java )
            startActivity(intent)
        }
    }
}