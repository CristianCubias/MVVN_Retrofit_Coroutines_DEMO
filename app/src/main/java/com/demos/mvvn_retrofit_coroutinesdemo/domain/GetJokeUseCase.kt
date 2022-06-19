package com.demos.mvvn_retrofit_coroutinesdemo.domain

import com.demos.mvvn_retrofit_coroutinesdemo.data.JokeRepository
import com.demos.mvvn_retrofit_coroutinesdemo.data.model.JokesModel


class GetJokeUseCase {

    private val repository = JokeRepository()

    suspend operator fun invoke():JokesModel{
        return repository.getJoke()
    }
}