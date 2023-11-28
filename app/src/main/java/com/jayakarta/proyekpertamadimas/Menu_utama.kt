package com.jayakarta.proyekpertamadimas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Menu_utama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_utama)
    }

    fun pindahkehalamankurir(view: View) {
        val intent = Intent(this, MainActivity::class.java).apply {
            //putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    fun pindahkehalamanrandomImage(view:View){
        val intent = Intent(this, RandomImage::class.java).apply {
            //putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
    fun pindahkehalamanRetrofitUser(view:View){
        val intent = Intent(this, RetrofitGetUserAPISAmple::class.java).apply {
            //putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
    fun pindahkehalamanListMovies(view:View){
        val intent = Intent(this, ListMovies::class.java).apply {
            //putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
}