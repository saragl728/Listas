package com.example.listas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listas.adapter.ActividadConMenus
import com.example.listas.databinding.ActivityMainBinding

class EditarPelicula : ActividadConMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("Editar/Añadir Películas")
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}