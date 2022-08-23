package com.example.authman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    lateinit var btnLogin:Button
    lateinit var emailedt:EditText
    lateinit var passwordedt:EditText

    //initialize firebase

    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //find our views
        emailedt = findViewById(R.id.edtEmail)
        passwordedt = findViewById(R.id.edtPassword)
        btnLogin = findViewById(R.id.login_btn)

        //initialize firebase
        auth = Firebase.auth

        btnLogin.setOnClickListener {

           loginUser()

        }





    }

    private fun loginUser() {
        //Toast.makeText(this, "Trying to Login", Toast.LENGTH_SHORT).show()
        //Convert inputs to string
        val userEmail = emailedt.text.toString()
        val userPassword = passwordedt.text.toString()

        auth.signInWithEmailAndPassword(userEmail, userPassword).addOnCompleteListener {
            if (it.isSuccessful) {
                //means if task is successful
                var intent = Intent(this, RegisterActivity::class.java)
                startActivity(intent)
            }
            else {
                Toast.makeText(this, "Failed to Sign in", Toast.LENGTH_LONG).show()
            }
        }




    }
}