package com.example.app_ejercicios.Model.Remote

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface EjerciciosApi {
    @GET("categorias.json")
    suspend fun fetchEjerciciosList():Response<List<Ejercicio>>

    @GET("categorias.json/{id}")
    suspend fun fetchEjercicio(@Path("id")id:String):Response<List<Ejercicio>>

}