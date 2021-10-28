package com.example.tasktwo

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignIn : AppCompatActivity() {
    lateinit var passWord: EditText
    lateinit var email: EditText
    lateinit var signIn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in)
        passWord = findViewById(R.id.password_sn)
        email = findViewById(R.id.email_sn)
        signIn = findViewById(R.id.sign_in)
        signIn.setOnClickListener(View.OnClickListener {
            val passText: String = passWord.text.toString()
            val emailText: String = passWord.text.toString()
            if (emailText.isEmpty()){
                Toast.makeText(this,"Enter an Email", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }

            if (passText.isEmpty()){
                Toast.makeText(this,"Enter a Password", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }

            Toast.makeText(this,"Well Done!", Toast.LENGTH_SHORT).show()

        })
    }
}