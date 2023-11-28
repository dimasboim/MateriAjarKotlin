package com.jayakarta.proyekpertamadimas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.jayakarta.proyekpertamadimas.databinding.ActivityMainBinding
import com.jayakarta.proyekpertamadimas.databinding.ActivityRandomImageBinding
import com.squareup.picasso.Picasso

class RandomImage : AppCompatActivity() {
    lateinit var binding: ActivityRandomImageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRandomImageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var buttonganti = binding.buttonGantiGambar
        var boxgambar = binding.boxgambar
        var textAngka = binding.textAngka

        buttonganti.setOnClickListener{
            var angkarandom = (1..4).random()
            textAngka.text  = angkarandom.toString()
            when (angkarandom) {
                1 -> boxgambar.setImageDrawable(getDrawable(R.drawable.superman_henry))
                2 -> boxgambar.setImageDrawable(getDrawable(R.drawable.superman_logo))
                3 -> boxgambar.setImageDrawable(getDrawable(R.drawable.superman_kartun))
                else -> { // Note the block
                    boxgambar.setImageDrawable(getDrawable(R.drawable.superman_brandon))
                }
            }
        }

        //menampilkan gambar dengan glide
        var boxgambarglide = binding.imageGlide
        var urlbatman = "https://img2.beritasatu.com/cache/beritasatu/960x620-3/2023/06/1686659465-4096x2160.webp"
        Glide
            .with(this)
            .load(urlbatman)
            .centerCrop()
            .into(boxgambarglide);

        //menampilkan gambar dengan picasso
        var boxgambarpicasso = binding.imagePicasso
        var urlSpider = "https://static.promediateknologi.id/crop/0x0:0x0/750x500/webp/photo/2023/06/22/Spiderman-29228218.jpg"

        Picasso.get().load(urlSpider).into(boxgambarpicasso)


    }



}