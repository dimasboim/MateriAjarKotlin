package com.jayakarta.proyekpertamadimas.ui.screens

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jayakarta.proyekpertamadimas.network.Movies.Movies
import com.jayakarta.proyekpertamadimas.network.Movies.MoviesNetwork
import com.jayakarta.proyekpertamadimas.network.User.User
import com.jayakarta.proyekpertamadimas.network.User.UserNetwork
import kotlinx.coroutines.launch


class MoviesViewModel : ViewModel() {

   // val myResponse: MutableLiveData<User> = MutableLiveData()
    val myResponseList: MutableLiveData<List<Movies>> = MutableLiveData()

    fun getMoviesNew() {
        viewModelScope.launch {

            myResponseList.value  = MoviesNetwork.retrofit.getMoviesNew()
        }
    }
    fun getMovies() {
        viewModelScope.launch {

            myResponseList.value  = MoviesNetwork.retrofit.getMovies().data
        }
    }
//
//    fun getPosts() {
//        viewModelScope.launch {
//            myResponseList.value = UserNetwork.retrofit.getPosts()
//        }
//    }
}