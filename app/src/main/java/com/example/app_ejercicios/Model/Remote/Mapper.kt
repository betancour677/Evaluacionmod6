package com.example.app_ejercicios.Model.Remote

import com.example.app_ejercicios.Model.Local.EjerciciosEntity

fun fromInternetToEjerciciosEntity(EjerciciosList: List<Ejercicio>):List<EjerciciosEntity>{
    return EjerciciosList.map{
        EjerciciosEntity(
            id=it.id,
            nombre=it.nombre,
            descripcion = it.descripcion,
            musculos_involucrados = it.musculos_involucrados,

        )
    }
}