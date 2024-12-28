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

class SignUpScreen : AppCompatActivity() {
    lateinit var signUp : Button
    lateinit var login : TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        signUp = findViewById(R.id.buttonS)
        signUp.setOnClickListener{

            var i = Intent(this, HomeScreen()::class.java)
            startActivity(i)
        }

        login = findViewById(R.id.signtologin)
        login.setOnClickListener{
            var i2 = Intent(this, LoginScreen()::class.java)
            startActivity(i2)
        }

    }
}