package com.example.app_ejercicios.Model.Remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    companion object {

        private const val BASE_URL = "https://api-ejercicios-66d44-default-rtdb.firebaseio.com/"
        lateinit var retrofitInstance:Retrofit
        fun retrofitInstance():EjerciciosApi{
        val retrofit= Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            return retrofit.create(EjerciciosApi::class.java)
        }
    }
}