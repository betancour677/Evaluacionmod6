package com.example.app_ejercicios.Model.Local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

interface ejercicioDao {



    @Dao
    interface ejercicioDao {

        //Insertar Lista
        @Insert(onConflict = OnConflictStrategy.REPLACE)
        suspend fun Insertallejercicios(ListEjercicios: List<EjerciciosEntity>)

        //Insertar Elemento

        @Insert(onConflict = OnConflictStrategy.REPLACE)
        suspend fun InsertarEjercicio(Ejercicio:EjerciciosEntity)

        @Query("SELECT*FROM Ejercicios ORDER BY id ASC")
        fun getAllEjercicios():LiveData<List<EjerciciosEntity>>


    }

}