package com.example.travelx

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var Account : Button
    lateinit var login : TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        Account = findViewById(R.id.Account)
        login = findViewById<TextView>(R.id.login)

        Account.setOnClickListener{
            // Explicit intent
            var createAccount = Intent(this, SignUpScreen::class.java)
            startActivity(createAccount)
        }

        login.setOnClickListener{
            //Explicit Intent

            var createLogin = Intent(this, LoginScreen::class.java )
            startActivity(createLogin)

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}