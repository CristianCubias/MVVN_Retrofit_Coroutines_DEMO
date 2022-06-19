package com.demos.mvvn_retrofit_coroutinesdemo.ui.viewmodel

import androidx.lifecycle.*
import com.demos.mvvn_retrofit_coroutinesdemo.data.model.JokesModel
import com.demos.mvvn_retrofit_coroutinesdemo.data.model.JokesProvider
import com.demos.mvvn_retrofit_coroutinesdemo.domain.GetJokeUseCase
import kotlinx.coroutines.launch

class JokesViewModel : ViewModel() {
    private val _jokesModel by lazy{ MutableLiveData<JokesModel>() }
    val jokesModel: LiveData<JokesModel> get() = _jokesModel
    private var getJokeUseCase = GetJokeUseCase()

    fun onCreate(){
        viewModelScope.launch {
            val result = getJokeUseCase()
            _jokesModel.value = result
        }
    }
}