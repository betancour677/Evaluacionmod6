package com.example.app_ejercicios.Model.Local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy

interface ejercicioDao {



    @Dao
    interface ejercicioDao {

        //Insertar Lista
        @Insert(onConflict = OnConflictStrategy.REPLACE)
        suspend fun Insertallejercicios(ListEjercicios: List<EjerciciosEntity>)

        //Insertar Elemento

        @Insert(onConflict = OnConflictStrategy.REPLACE)
        suspend fun InsertarEjercicio(Ejercicio:EjerciciosEntity)


    }

}