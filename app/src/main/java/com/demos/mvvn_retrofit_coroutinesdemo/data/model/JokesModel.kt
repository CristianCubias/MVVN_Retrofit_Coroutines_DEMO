package com.demos.mvvn_retrofit_coroutinesdemo.data.model

import com.squareup.moshi.Json

data class JokesModel (val id:String,
                       val joke:String,
                       val status:Int)