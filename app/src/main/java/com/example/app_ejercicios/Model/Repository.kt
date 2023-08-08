package com.example.app_ejercicios.Model

import com.example.app_ejercicios.Model.Local.ejercicioDao
import com.example.app_ejercicios.Model.Remote.RetrofitClient

class Repository(private val _ejercicioDao:ejercicioDao){
    private val networkService = RetrofitClient.retrofitInstance()

    val ejerciciosListLiveData= _ejercicioDao.getAllEjercicios()

    suspend fun fetchEjercicios(){
        val service = kotlin.runCatching { networkService.fetchEjerciciosList()}
        service.onSuccess {
            when(it.code()){
        }

        }
    }

}