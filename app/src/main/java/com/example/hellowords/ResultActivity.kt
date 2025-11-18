package com.example.hellowords

import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hellowords.adapter.TransformersAdapter
import com.example.hellowords.databinding.ActivityResultBinding
import com.example.hellowords.databinding.DialogModoOscuroBinding


class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    // Guarda el adaptador como una propiedad de la clase para poder acceder a él
    private lateinit var adapter: TransformersAdapter

    // Variable para recordar el estado del modo oscuro
    private var modoOscuroActivado = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
        showNombre()
        temaOscuro()

    }

    fun initRecyclerView(){
        binding.recycleTransformers.layoutManager = LinearLayoutManager(this)
        binding.recycleTransformers.adapter = TransformersAdapter(TransformersProvider.transformersList)
    }

    fun temaOscuro(){
        binding.ivSettings.setOnClickListener({
            mostrarDialogoTema()
        })
    }

    private fun mostrarDialogoTema() {
        // 1. Infla (crea) la vista del diálogo desde su XML
        val dialogBinding = DialogModoOscuroBinding.inflate(layoutInflater)
        // Sincroniza el estado del checkbox con nuestra variable
        dialogBinding.chkModoOscuro.isChecked = modoOscuroActivado

        // 2. Construye el AlertDialog
        val builder = AlertDialog.Builder(this)
        builder.setView(dialogBinding.root) // Asigna tu vista personalizada
        builder.setTitle("Configuración de Tema")

        // 3. Define la acción para el botón "Aplicar"
        builder.setPositiveButton("Aplicar") { _, _ ->
            // Actualiza la variable con el estado del checkbox
            modoOscuroActivado = dialogBinding.chkModoOscuro.isChecked

            // Llama a la función para cambiar el color
            actualizarColorFondo()
        }

        // 5. Crea y muestra el diálogo
        builder.create().show()
    }

    private fun actualizarColorFondo() {
        if (modoOscuroActivado) {
            // Si el modo oscuro está activado, pone el fondo negro
            binding.root.setBackgroundColor(Color.BLACK)        } else {
            // Si está desactivado, lo pone blanco
            binding.root.setBackgroundColor(Color.WHITE)
        }
    }


    private fun showNombre() {
        val name = intent.getStringExtra("INTENT_NAME") ?: ""
        binding.tvGreeting.text = "Bienvenido $name"
    }
}
