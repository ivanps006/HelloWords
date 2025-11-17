package com.example.hellowords

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hellowords.adapter.TransformersAdapter
import com.example.hellowords.databinding.ActivityResultBinding


class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
        showNombre()

    }

    fun initRecyclerView(){
        binding.recycleTransformers.layoutManager = LinearLayoutManager(this)
        binding.recycleTransformers.adapter = TransformersAdapter(TransformersProvider.transformersList)
    }

    private fun showNombre() {
        val name = intent.getStringExtra("INTENT_NAME") ?: ""
        binding.tvGreeting.text = "Bienvenido $name"
    }
}
