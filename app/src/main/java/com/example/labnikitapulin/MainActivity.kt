package com.example.labnikitapulin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val enterButton = findViewById<Button>(R.id.enterButton)
        val sendButton = findViewById<Button>(R.id.sendButton)

        enterButton.setOnClickListener {
            if (emailEditText.text.toString() == getString(R.string.email_hint_text) && passwordEditText.text.toString() == getString(
                    R.string.password_hint_text
                )
            ) {
                val intent = Intent(this, SecondActivity::class.java)
                val greetingText = getString(R.string.greeting_text)
                intent.putExtra("GREETING", greetingText)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Пользователь не найден", Toast.LENGTH_SHORT).show()
            }
        }

        sendButton.setOnClickListener {
            if (emailEditText.text.toString() == getString(R.string.email_hint_text) && passwordEditText.text.toString() == getString(
                    R.string.password_hint_text
                )
            ) {
                val intent = Intent(this, SecondActivity::class.java)
                val greetingText = getString(R.string.greeting_text)
                intent.putExtra("GREETING", greetingText)
                startActivity(intent)
            } else {
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            }
        }

    }

}