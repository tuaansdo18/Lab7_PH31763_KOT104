package com.dovantuan.lab7_ph31763_kot104.service

import com.dovantuan.lab7_ph31763_kot104.response.MovieResponse
import retrofit2.Response
import retrofit2.http.GET

interface MovieService {
    @GET("Movies")
    suspend fun getListFilms(): Response<List<MovieResponse>>
}