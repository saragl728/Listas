package com.example.listas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listas.adapter.ActividadConMenus
import com.example.listas.databinding.ActivityMainBinding

class Info : ActividadConMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTitle("Información de la aplicación")
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}