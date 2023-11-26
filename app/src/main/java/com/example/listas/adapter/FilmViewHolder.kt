package com.example.listas.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listas.Film
import com.example.listas.databinding.ItemFilmBinding

class FilmViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var binding = ItemFilmBinding.bind(view)
    fun render(filmModel: Film){
        binding.FilmName.text = filmModel.title
        binding.FilmDirector.text = filmModel.director
        binding.FilmYear.text = filmModel.year.toString()
        Glide.with(binding.FilmPhoto.context).load(filmModel.foto).into(binding.FilmPhoto)
        //evento de hacer click sobre la imagen de la película
        binding.FilmPhoto.setOnClickListener {
            Toast.makeText(binding.FilmPhoto.context, filmModel.title, Toast.LENGTH_LONG).show()
        }
        //evento de hacer click sobre toda la película
        itemView.setOnClickListener {
            Toast.makeText(binding.FilmPhoto.context, filmModel.director, Toast.LENGTH_LONG).show()
        }
    }
}