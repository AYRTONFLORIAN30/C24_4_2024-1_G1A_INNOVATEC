package com.florian.ayrton.proyectofinal.ui.theme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.florian.ayrton.proyectofinal.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttonLogin: Button = findViewById(R.id.buttonLogin)
        val registerLink: TextView = findViewById(R.id.textViewRegister)

        buttonLogin.setOnClickListener {
            // Aquí puedes agregar la lógica para verificar el inicio de sesión.
            // Si el inicio de sesión es exitoso, redirige a la HomeActivity:
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish() // Finaliza la actividad actual para que el usuario no pueda volver a ella con el botón de retroceso.
        }

        registerLink.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}




