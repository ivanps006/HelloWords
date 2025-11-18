package com.example.hellowords.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hellowords.R
import com.example.hellowords.Transformers

class TransformersAdapter( private var transformersList: List<Transformers>) : RecyclerView.Adapter<TransformersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransformersViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return TransformersViewHolder(layoutInflater.inflate(R.layout.item_transformers, parent, false))
    }

    override fun onBindViewHolder(holder: TransformersViewHolder, position: Int) {
        val item = transformersList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = transformersList.size

    // --- AÑADE ESTA FUNCIÓN AQUÍ ---
    // Esta función permitirá que la Activity actualice la lista que muestra el RecyclerView
    fun actualizarLista(nuevaLista: List<Transformers>) {
        transformersList = nuevaLista
        notifyDataSetChanged() // Notifica al RecyclerView que los datos cambiaron y debe redibujarse
    }

}