package com.example.moviesappcompose.features.movies.domain.repository

import com.example.moviesappcompose.common.ApiState
import com.example.moviesappcompose.data.model.Movies
import kotlinx.coroutines.flow.Flow

interface MovieRepository {

    suspend fun getMovies(): Flow<ApiState<Movies>>
}