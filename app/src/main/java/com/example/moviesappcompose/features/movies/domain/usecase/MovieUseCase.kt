package com.example.moviesappcompose.features.movies.domain.usecase

import com.example.moviesappcompose.common.ApiState
import com.example.moviesappcompose.common.map
import com.example.moviesappcompose.data.model.Movies
import com.example.moviesappcompose.features.movies.domain.mapper.MovieMapper
import com.example.moviesappcompose.features.movies.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class MovieUseCase @Inject constructor(
    private val repo: MovieRepository,
    private val mapper: MovieMapper
) {

    suspend fun getMovies(): Flow<ApiState<List<Movies.Results>?>> {
        return repo.getMovies().map { results ->
            results.map {
                mapper.fromMap(it)
            }
        }
    }
}