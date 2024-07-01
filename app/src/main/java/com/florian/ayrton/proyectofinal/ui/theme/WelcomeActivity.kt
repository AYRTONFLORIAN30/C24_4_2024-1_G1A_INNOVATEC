package com.florian.ayrton.proyectofinal.ui.theme

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.florian.ayrton.proyectofinal.R
import android.util.Log

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val fullName = intent.getStringExtra("EXTRA_FULL_NAME") ?: "Usuario Desconocido"
        val userEmail = intent.getStringExtra("EXTRA_EMAIL") ?: "Correo no proporcionado"
        val userAddress = intent.getStringExtra("EXTRA_ADDRESS") ?: "Dirección no proporcionada"

        Log.d("WelcomeActivity", "Received Full Name: $fullName")
        Log.d("WelcomeActivity", "Received Email: $userEmail")
        Log.d("WelcomeActivity", "Received Address: $userAddress")

        val welcomeMessage = findViewById<TextView>(R.id.welcomeMessage)
        welcomeMessage.text = "¡Bienvenido, $fullName!"

        val emailTextView = findViewById<TextView>(R.id.emailTextView)
        emailTextView.text = "Correo: $userEmail"

        val addressTextView = findViewById<TextView>(R.id.addressTextView)
        addressTextView.text = "Dirección: $userAddress"
    }
}
