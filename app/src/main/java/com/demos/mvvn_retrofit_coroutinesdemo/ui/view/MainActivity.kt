package com.demos.mvvn_retrofit_coroutinesdemo.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.demos.mvvn_retrofit_coroutinesdemo.databinding.ActivityMainBinding
import com.demos.mvvn_retrofit_coroutinesdemo.ui.viewmodel.JokesViewModel

class MainActivity : AppCompatActivity() {

    //ViewBinding
    private lateinit var binding : ActivityMainBinding

    //ViewModel
    private val model: JokesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnGetJoke.setOnClickListener {
            getDadJoke()
        }
    }
    private fun getDadJoke(){
        model.onCreate()
        model.jokesModel.observe(this) { currentJoke ->
            binding.txtViewJoke.text = currentJoke.joke
        }
    }


}