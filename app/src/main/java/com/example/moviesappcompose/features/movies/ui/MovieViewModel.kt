package com.example.moviesappcompose.features.movies.ui

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moviesappcompose.common.doOnFailure
import com.example.moviesappcompose.common.doOnLoading
import com.example.moviesappcompose.common.doOnSuccess
import com.example.moviesappcompose.data.model.Movies
import com.example.moviesappcompose.features.movies.domain.usecase.MovieUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MovieViewModel @Inject constructor(
    private val useCase: MovieUseCase
) : ViewModel() {

    private val _res: MutableState<MovieState> = mutableStateOf(MovieState())
    val res: State<MovieState> = _res

    init {
        viewModelScope.launch {
            useCase.getMovies()
                .doOnSuccess {
                    _res.value = MovieState(
                        data = it!!
                    )
                }.doOnFailure {
                    _res.value = MovieState(
                        error = it?.message!!
                    )
                }.doOnLoading {
                    _res.value = MovieState(
                        isLoading = true
                    )
                }.collect()
        }
    }
}


data class MovieState(
    val data: List<Movies.Results> = emptyList(),
    val error: String = "",
    val isLoading: Boolean = false
)