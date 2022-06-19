package com.demos.mvvn_retrofit_coroutinesdemo.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.demos.mvvn_retrofit_coroutinesdemo.data.model.JokesModel
import com.demos.mvvn_retrofit_coroutinesdemo.data.model.JokesProvider
import com.demos.mvvn_retrofit_coroutinesdemo.domain.GetJokeUseCase
import kotlinx.coroutines.launch

class JokesViewModel : ViewModel() {
    val jokesModel = MutableLiveData<JokesModel>()

    var getJokeUseCase = GetJokeUseCase()

    fun onCreate(){
        viewModelScope.launch {
            val result = getJokeUseCase()

            jokesModel.postValue(result)
        }
    }
}