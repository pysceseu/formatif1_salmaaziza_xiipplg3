package com.example.formatif1_salmaaziza_xiipplg3.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database (entities = [Barang::class], version = 1)
abstract class dbBarang : RoomDatabase() {
    abstract fun DAO(): BarangDAO

    companion object {
        @Volatile
        private var INSTANCE: dbBarang? = null
        private var key = Any()
        operator fun invoke(context: Context) = INSTANCE ?: synchronized(key) {
            INSTANCE ?: buildDatabase(context).also {
                INSTANCE = it
            }
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext, dbBarang::class.java, " toko SMKSA mart"
        ).fallbackToDestructiveMigration().build()
    }
}