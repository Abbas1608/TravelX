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

class LoginScreen : AppCompatActivity() {
    lateinit var login : Button
    lateinit var signUp : TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        login = findViewById(R.id.button)
        login.setOnClickListener{
            var v = Intent(this, HomeScreen()::class.java)
            startActivity(v)
        }

        signUp = findViewById(R.id.signUp)
        signUp.setOnClickListener{
            var s = Intent(this, SignUpScreen()::class.java)
            startActivity(s)
        }
    }
}