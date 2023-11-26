package com.example.listas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listas.adapter.ActividadConMenus
import com.example.listas.adapter.FilmAdapter
import com.example.listas.databinding.ActivityMainBinding

class MainActivity : ActividadConMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTitle("Lista de películas")
        super.onCreate(savedInstanceState)
        var adapter = FilmAdapter(FilmProvider.filmList)
        //setContentView(R.layout.activity_main)
        //val decoration = DividerItemDecoration(this, LinearLayoutManager.VERTICAL)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recycler.layoutManager = LinearLayoutManager(this)
        //binding.recycler.layoutManager = GridLayoutManager(this, 2)
        binding.recycler.adapter = adapter
        //binding.recycler.addItemDecoration(decoration)

        binding.buscador.addTextChangedListener { buscador ->
            val filtroPelicula =
                FilmProvider.filmList.filter { parques ->
                    parques.title.lowercase().contains(buscador.toString().lowercase())
                }
            adapter.actualizarPeliculas(filtroPelicula)
        }
    }
}