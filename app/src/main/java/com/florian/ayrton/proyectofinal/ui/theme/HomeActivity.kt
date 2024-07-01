package com.florian.ayrton.proyectofinal.ui.theme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.florian.ayrton.proyectofinal.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Asegúrate de que el ID del botón aquí coincide con el definido en tu archivo XML
        val buttonSeeMoreLaptops = findViewById<Button>(R.id.buttonSeeMoreLaptops)
        buttonSeeMoreLaptops.setOnClickListener {
            // Aquí manejas lo que sucede cuando se hace clic en "Ver más"
            // Por ejemplo, iniciar una nueva actividad que muestra más laptops
            val intent = Intent(this, LaptopsActivity::class.java)
            startActivity(intent)
        }
    }
}
