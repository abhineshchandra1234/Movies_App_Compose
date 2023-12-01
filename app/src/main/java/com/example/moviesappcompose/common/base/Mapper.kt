package com.example.moviesappcompose.common.base

interface Mapper<F, T> {

    fun fromMap(from: F): T
}