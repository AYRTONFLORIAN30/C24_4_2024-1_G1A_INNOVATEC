package com.florian.ayrton.proyectofinal.models

data class Producto(
    val id: Long,
    val nombre: String,
    val descripcion: String?,
    val precio: Double,
    val stock: Int,
    val imagen: String?,
    val categoria: Categoria,
    val marca: Marca
)