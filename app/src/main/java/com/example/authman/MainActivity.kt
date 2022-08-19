package com.example.authman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btnLogin:Button
    lateinit var emailedt:EditText
    lateinit var passwordedt:EditText

    lateinit var btnLogin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //find our views
        emailedt = findViewById(R.id.edtEmail)
        passwordedt = findViewById(R.id.edtPassword)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {

            val user_Email = emailedt.text.toString()
            val user_Password = passwordedt.text.toString()




        }





    }
}