package com.example.app_ejercicios.Model.Local

import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity (tableName="Ejercicios")
 data class EjerciciosEntity (

    @PrimaryKey(autoGenerate = true)
    @NotNull
    val id: Int,
    val nombre: String,
    val descripcion: String,
    val musculos_involucrados: String

     )


