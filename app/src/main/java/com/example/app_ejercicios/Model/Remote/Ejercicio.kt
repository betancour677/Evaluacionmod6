package com.example.app_ejercicios.Model.Remote

import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

data class Ejercicio (

        @PrimaryKey(autoGenerate = true)
        @NotNull
        val id: Int,
        val nombre: String,
        val descripcion: String,
        val musculos_involucrados: String,
        )
