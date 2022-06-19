package com.demos.mvvn_retrofit_coroutinesdemo.data.network

import com.demos.mvvn_retrofit_coroutinesdemo.data.model.JokesModel
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface JokesApiClient {
    @Headers("Accept: application/json")
    @GET(".")
    suspend fun getJoke():Response<JokesModel>
}