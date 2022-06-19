package com.demos.mvvn_retrofit_coroutinesdemo.data

import com.demos.mvvn_retrofit_coroutinesdemo.data.model.JokesModel
import com.demos.mvvn_retrofit_coroutinesdemo.data.model.JokesProvider
import com.demos.mvvn_retrofit_coroutinesdemo.data.network.JokeService

class JokeRepository {
    private val api = JokeService()

    suspend fun getJoke():JokesModel{
        val response = api.getJoke()
        JokesProvider.joke
        return response
    }
}