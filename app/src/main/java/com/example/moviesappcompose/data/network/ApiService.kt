package com.example.moviesappcompose.data.network

import com.example.moviesappcompose.data.model.Movies
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    companion object {
        const val BASE_URL = "https://api.themoviedb.org/3/"
        const val IMAGE_URL = "https://image.tmdb.org/t/p/w500"
    }

    @GET("discover/movie?api_key=f994296f1aa610c1c468e83ce3fa991b")
    suspend fun getMovies(): Response<Movies>

}