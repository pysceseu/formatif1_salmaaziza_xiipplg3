package com.example.formatif1_salmaaziza_xiipplg3.db

import androidx.room.*

@Dao
interface BarangDAO {

    @Insert
    fun insertDataBarang(barang: Barang)

    @Delete
    fun deleteDataBarang(barang: Barang)

    @Update
    fun updateDataBarang(barang: Barang)

    @Query("SELECT * FROM tbBarang")
    fun getDataBarang() : List<Barang>

}
