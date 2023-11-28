package com.jayakarta.proyekpertamadimas.network.Movies
  import retrofit2.http.GET

interface MoviesAPI {

//    @GET("api/movies")
//    suspend fun getPost(): User

    @GET("api/moviesNew")
    suspend fun getMoviesNew(): List<Movies>

    @GET("api/movies")
    suspend fun getMovies(): ResponseMovies
}