package com.demos.mvvn_retrofit_coroutinesdemo.data.network

import com.demos.mvvn_retrofit_coroutinesdemo.data.model.JokesModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class JokeService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getJoke():JokesModel {
        return withContext(Dispatchers.IO){
            val response = retrofit.create(JokesApiClient::class.java).getJoke()
            response.body() ?: JokesModel("", "", 0)
        }
    }
}