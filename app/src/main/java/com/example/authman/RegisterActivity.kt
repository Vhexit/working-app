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

class RegisterActivity : AppCompatActivity() {

    lateinit var Buttonreg:Button
    lateinit var emailinp:EditText
    lateinit var passinp:EditText
    lateinit var confpassinp:EditText

    private lateinit var auth: FirebaseAuth



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        //find our ids
        Buttonreg=findViewById(R.id.btnLogin)
        emailinp = findViewById(R.id.edtEmail)
        passinp = findViewById(R.id.edtPassword)
        confpassinp =findViewById(R.id.edtConfPassword)

        //initialize firebase Auth
        auth = Firebase.auth




        Buttonreg.setOnClickListener {

            //sign u

        }


    }
}