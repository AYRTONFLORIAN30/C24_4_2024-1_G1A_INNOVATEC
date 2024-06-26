package com.florian.ayrton.proyectofinal.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.florian.ayrton.proyectofinal.R
import androidx.recyclerview.widget.RecyclerView
import com.florian.ayrton.proyectofinal.models.Categoria

class CategoriaAdapter(private val categorias: List<Categoria>) : RecyclerView.Adapter<CategoriaAdapter.CategoriaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_categoria, parent, false)
        return CategoriaViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoriaViewHolder, position: Int) {
        holder.bind(categorias[position])
    }

    override fun getItemCount(): Int = categorias.size

    class CategoriaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nombre: TextView = itemView.findViewById(R.id.nombre)
        private val descripcion: TextView = itemView.findViewById(R.id.descripcion)

        fun bind(categoria: Categoria) {
            nombre.text = categoria.nombre
            descripcion.text = categoria.descripcion
        }
    }
}

