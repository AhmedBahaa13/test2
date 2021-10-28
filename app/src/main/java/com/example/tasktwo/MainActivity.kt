package com.example.tasktwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var userName: EditText
    lateinit var passWord: EditText
    lateinit var email: EditText
    lateinit var button:Button
    lateinit var intentSignIn:TextView
    var userText: String = ""
    var passText: String = ""
    var emailText: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        intentSignIn = findViewById(R.id.intent_signin)
        button = findViewById(R.id.signup)
        userName = findViewById(R.id.user_name)
        passWord = findViewById(R.id.password)
        email = findViewById(R.id.email)
        button.setOnClickListener(View.OnClickListener {
            userText=userName.text.toString()
            passText=passWord.text.toString()
            emailText=email.text.toString()

            if (userText.isEmpty()){
                Toast.makeText(this,"Enter a UserName",Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            if (passText.isEmpty()){
                Toast.makeText(this,"Enter a Password",Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            if (emailText.isEmpty()){
                Toast.makeText(this,"Enter an Email",Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            Toast.makeText(this,"UserName is $userText",Toast.LENGTH_SHORT).show()

        })

        intentSignIn.setOnClickListener(View.OnClickListener {
            var intent = Intent(this,SignIn::class.java)
        startActivity(intent)
        })


    }
}