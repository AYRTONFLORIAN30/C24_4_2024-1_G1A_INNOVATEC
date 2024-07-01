package com.florian.ayrton.proyectofinal.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.florian.ayrton.proyectofinal.R
import com.florian.ayrton.proyectofinal.models.Producto
import android.widget.ImageView


class ProductoAdapter(private val productos: List<Producto>) : RecyclerView.Adapter<ProductoAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_producto, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val producto = productos[position]
        holder.nombreTextView.text = producto.nombre
        holder.precioTextView.text = producto.precio
        holder.productImageView.setImageResource(producto.imagenId)  // Configurar la imagen
    }

    override fun getItemCount() = productos.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val productImageView: ImageView = view.findViewById(R.id.productImageView)
        val nombreTextView: TextView = view.findViewById(R.id.nombreTextView)
        val precioTextView: TextView = view.findViewById(R.id.precioTextView)
    }
}
