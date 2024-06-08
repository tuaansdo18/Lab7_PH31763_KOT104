package com.dovantuan.lab7_ph31763_kot104

import com.dovantuan.lab7_ph31763_kot104.model.Movie
import com.dovantuan.lab7_ph31763_kot104.response.MovieResponse


fun MovieResponse.toMovie(): Movie {
    return Movie(
        id = this.filmId,
        title = this.filmName,
        duration = this.duration,
        releaseDate = this.releaseDate,
        genre = this.genre,
        national = national,
        shotDescription = this.description,
        posterUrl = this.image
    )
}