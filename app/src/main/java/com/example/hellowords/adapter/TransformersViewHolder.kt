package com.example.hellowords.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hellowords.Transformers
import com.example.hellowords.databinding.ItemTransformersBinding

class TransformersViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val binding = ItemTransformersBinding.bind(view)

    fun render(transformersModel: Transformers){
        binding.tvTransformersName.text = transformersModel.transformers
        binding.tvTransformersVehiculo.text = transformersModel.formaVehiculo
        binding.tvTransformersBando.text = transformersModel.bando
        Glide.with(binding.ivTransformers.context).load(transformersModel.photo).into(binding.ivTransformers)
        binding.ivTransformers.setOnClickListener {
            Toast.makeText(
                binding.ivTransformers.context,
                transformersModel.transformers,
                Toast.LENGTH_SHORT
            ).show()
        }

        itemView.setOnClickListener { Toast.makeText(
            binding.ivTransformers.context,
            transformersModel.bando,
            Toast.LENGTH_SHORT
        ).show() }
    }
}