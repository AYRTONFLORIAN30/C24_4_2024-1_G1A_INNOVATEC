package com.florian.ayrton.proyectofinal.ui.theme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.florian.ayrton.proyectofinal.R

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val nameEditText = findViewById<EditText>(R.id.editTextName)
        val surnameEditText = findViewById<EditText>(R.id.editTextSurname)
        val emailEditText = findViewById<EditText>(R.id.editTextEmail)
        val passwordEditText = findViewById<EditText>(R.id.editTextPassword)
        val addressEditText = findViewById<EditText>(R.id.editTextAddress)
        val registerButton = findViewById<Button>(R.id.buttonRegister)

        registerButton.setOnClickListener {
            val password = passwordEditText.text.toString()
            if (password.length < 8) {
                Toast.makeText(this, "La contraseña debe tener al menos 8 caracteres.", Toast.LENGTH_LONG).show()
            } else {
                val fullName = nameEditText.text.toString() + " " + surnameEditText.text.toString()
                val intent = Intent(this, WelcomeActivity::class.java).apply {
                    putExtra("EXTRA_FULL_NAME", fullName)
                    putExtra("EXTRA_EMAIL", emailEditText.text.toString())
                    putExtra("EXTRA_ADDRESS", addressEditText.text.toString())
                }
                startActivity(intent)
            }
        }

        val loginTextView = findViewById<TextView>(R.id.textViewLogin)
        loginTextView.setOnClickListener {
            // Redirige a LoginActivity
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}

