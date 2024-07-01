package com.florian.ayrton.proyectofinal.ui.theme

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager
import com.florian.ayrton.proyectofinal.R
import com.florian.ayrton.proyectofinal.adapters.ProductsAdapter
import com.florian.ayrton.proyectofinal.models.Product

class LaptopsActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var productsAdapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_laptops)

        recyclerView = findViewById(R.id.recyclerViewLaptops)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        productsAdapter = ProductsAdapter(loadProducts())
        recyclerView.adapter = productsAdapter
    }

    private fun loadProducts(): List<Product> {
        return listOf(
            Product("Laptop HP", "S/ 2000", R.drawable.laptop_hp),
            Product("Laptop Dell", "S/ 2500", R.drawable.laptop_dell),
            Product("Laptop Asus", "S/ 2200", R.drawable.laptop_asus),
            Product("Laptop Acer", "S/ 1800", R.drawable.laptop_acer),
            Product("Laptop Lenovo", "S/ 2400", R.drawable.laptop_lenovo),
            Product("Laptop Apple", "S/ 3000", R.drawable.laptop_apple)
        )
    }
}



