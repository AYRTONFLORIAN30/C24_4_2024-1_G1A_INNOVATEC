package com.florian.ayrton.proyectofinal.api

import retrofit2.Call
import retrofit2.http.GET
import com.florian.ayrton.proyectofinal.models.Categoria


interface ApiService {
    @GET("api/categorias")
    fun fetchCategorias(): Call<List<Categoria>>
}