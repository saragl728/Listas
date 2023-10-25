package com.example.listas.adapter
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listas.Film

class FilmAdapter(val filmList: List<Film>) : RecyclerView.Adapter<FilmViewHolder> {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return filmList.size
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}