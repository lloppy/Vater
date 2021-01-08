package com.example.vater

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var mp: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mp = MediaPlayer.create(this, R.raw.music)


        playButton.setOnClickListener() {
            if (mp.isPlaying) {
                // Stop
                mp.pause()
                playButton.setBackgroundResource(R.drawable.vadichka_stop)
                Toast.makeText(this, "water stop play", Toast.LENGTH_SHORT).show()


            } else {
                // Start
                mp.start()
                playButton.setBackgroundResource(R.drawable.vadichka)
                Toast.makeText(this, "water start play", Toast.LENGTH_SHORT).show()
            }

        }
    }
}