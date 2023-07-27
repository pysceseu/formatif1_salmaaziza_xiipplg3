package com.example.formatif1_salmaaziza_xiipplg3.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbBarang")
data class Barang(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val ID: Int,

    @ColumnInfo(name = "nama_barang")
    val nama_barang: String,

    @ColumnInfo(name = "harga")
    val harga: Int,

    @ColumnInfo(name = "stok")
    val stok: Int
)
