package com.example.formatif1_salmaaziza_xiipplg3.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.formatif1_salmaaziza_xiipplg3.R
import com.example.formatif1_salmaaziza_xiipplg3.db.Barang

class AdapterBarang(val list: List<Barang>):
        RecyclerView.Adapter<AdapterBarang.ViewHolder>(){
        class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

            val namaBarang = itemView.findViewById<TextView>(R.id.txtnama)
            val hargaBarang = itemView.findViewById<TextView>(R.id.txtharga)
            val stokBarang = itemView.findViewById<TextView>(R.id.txtstok)
            val hapus = itemView.findViewById<ImageButton>(R.id.imgbtnhapus)
            val simpan = itemView.findViewById<ImageButton>(R.id.imgbtnsv)

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.barang_adapter, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaBarang.text = list[position].nama_barang
        holder.hargaBarang.text = list[position].harga.toString()
        holder.stokBarang.text = list[position].stok.toString()

    }

    override fun getItemCount(): Int {
        return list.size
    }
    }
