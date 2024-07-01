package com.florian.ayrton.proyectofinal.ui.theme

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.florian.ayrton.proyectofinal.databinding.ActivityProductDetailsBinding

class ProductDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProductDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Recibe los datos del producto
        val productName = intent.getStringExtra("EXTRA_PRODUCT_NAME")
        val productPrice = intent.getStringExtra("EXTRA_PRODUCT_PRICE")
        val productDescription = intent.getStringExtra("EXTRA_PRODUCT_DESCRIPTION")

        binding.textProductName.text = productName
        binding.textProductPrice.text = productPrice
        binding.textProductDescription.text = productDescription

        binding.buttonAddToCart.setOnClickListener {
            // Lógica para añadir al carrito
        }
    }
}