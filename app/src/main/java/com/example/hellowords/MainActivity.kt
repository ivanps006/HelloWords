package com.example.hellowords

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.hellowords.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Inicializa el binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ahora podemos acceder al botón
        binding.btnChangeActivity.setOnClickListener {
            check()
        }

    }

    fun check(){
        if (binding.etName.text.isNotEmpty()){
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("INTENT_NAME", binding.etName.text.toString())
            startActivity(intent)
        }else{
            errorNom()
        }

    }

    fun errorNom(){
        Toast.makeText(this,"Nombre de usuario vacío", Toast.LENGTH_SHORT).show()
    }

}