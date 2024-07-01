package com.florian.ayrton.proyectofinal.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.florian.ayrton.proyectofinal.R
import com.florian.ayrton.proyectofinal.models.Product




class ProductsAdapter(private val productList: List<Product>) : RecyclerView.Adapter<ProductsAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_producto, parent, false)
        return ProductViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val currentProduct = productList[position]
        holder.nameTextView.text = currentProduct.name
        holder.priceTextView.text = currentProduct.price
        holder.productImageView.setImageResource(currentProduct.imageResourceId) // Configurando la imagen

        holder.addToCartButton.setOnClickListener {
            // Aquí puedes manejar eventos cuando se presiona el botón Añadir al carro
        }
    }

    override fun getItemCount(): Int = productList.size

    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val productImageView: ImageView = itemView.findViewById(R.id.productImageView)
        val nameTextView: TextView = itemView.findViewById(R.id.nombreTextView)
        val priceTextView: TextView = itemView.findViewById(R.id.precioTextView)
        val addToCartButton: Button = itemView.findViewById(R.id.addToCartButton)
    }
}
