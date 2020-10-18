package com.vit.leepair

import android.content.ComponentName
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_direct.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data =
                Uri.parse("leeplayer://player?type=movie&link=https://www2.himovies.to/api/movie/info/39539&episodeId=2479&start_time=10000")
            startActivity(intent)
        }

        button_movie.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data =
                Uri.parse("leeplayer://player?type=movie&link=https://www2.himovies.to/api/movie/info/6223&start_time=10000")
            startActivity(intent)
        }

        button_download.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("leeplayer://download?download_url=https://b-g-d-fr-1.betterstream.co/download/7bb7ce66880ba70393efe868138b3ab90f0e3e2e3d7261f178ef4370b81dfe8aa5e5d9cfe8b1678dd4623c32f422418c7973e821ee3f4a1040dc02def12563a4da24c3e4d463d87e3105c31a57b35fc3689998c9625d6288326687713ac25b05387645d287e5022f7479decd536ad26ac7713675a55958e6ffda7e9f29f978738a2569979819924b39f59a63c3c691c46293ddc025b81ee673da78ee991aaecc" +
                    "&callback_url=https://cnh.tmdbapi.ru/api/mobile/1/download_manager/insert" +
                    "&subtitle_url=https://thepaciellogroup.github.io/AT-browser-tests/video/subtitles-en.vtt" +
                    "&lang_name=English Viet")
            startActivity(intent)
        }
    }
}