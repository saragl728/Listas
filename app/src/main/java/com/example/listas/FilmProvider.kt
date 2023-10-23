package com.example.listas

class FilmProvider {
    companion object {
        val filmList = listOf<Film>(
            Film(title = "Lightyear", director = "director", year = 2022, foto = "https://upload.wikimedia.org/wikipedia/en/f/f9/Lightyear_%28film%29_poster.jpg"),
            Film(title = "El Renacido", director = "Tipo de Incógnito", year = 2015, foto = "https://upload.wikimedia.org/wikipedia/en/b/b6/The_Revenant_2015_film_poster.jpg"),
            Film(title = "Star Wars", director = "Luna de Plutón", year = 1997, foto = "https://upload.wikimedia.org/wikipedia/en/8/87/StarWarsMoviePoster1977.jpg"),
            Film(title = "The Super Mario Bros Movie", director = "Mengano Calleja", year = 2023, foto = "https://upload.wikimedia.org/wikipedia/en/4/44/The_Super_Mario_Bros._Movie_poster.jpg")
        )
    }
}