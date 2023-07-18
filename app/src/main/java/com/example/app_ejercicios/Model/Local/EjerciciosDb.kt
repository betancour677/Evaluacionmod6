package com.example.app_ejercicios.Model.Local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


 @Database(entities = [EjerciciosEntity::class], version=1, exportSchema=false)
abstract class EjerciciosDb: RoomDatabase() {


     abstract fun getejercicioDao(): ejercicioDao

    companion object {
        @Volatile
        private var
                INSTANCE : EjerciciosDb? = null
        fun getDataBase(context: Context) : EjerciciosDb {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    EjerciciosDb::class.java, "ejercicios_appDB")
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }

 }


