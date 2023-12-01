package com.example.moviesappcompose.data.repository

import com.example.moviesappcompose.common.ApiState
import com.example.moviesappcompose.common.base.BaseRepository
import com.example.moviesappcompose.data.model.Movies
import com.example.moviesappcompose.data.network.ApiService
import com.example.moviesappcompose.features.movies.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : MovieRepository, BaseRepository() {
    override suspend fun getMovies(): Flow<ApiState<Movies>> = safeApiCall {
        apiService.getMovies()
    }

}