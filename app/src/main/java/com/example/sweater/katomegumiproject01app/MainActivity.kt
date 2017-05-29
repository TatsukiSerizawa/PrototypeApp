package com.example.sweater.katomegumiproject01app

import android.media.MediaPlayer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val kato_voice1: MediaPlayer = MediaPlayer.create(this, R.raw.kato_jikoshokai)
        val kato_voice2: MediaPlayer = MediaPlayer.create(this, R.raw.kato_shintyoku)
        val kato_voice3: MediaPlayer = MediaPlayer.create(this, R.raw.kato_otsukare)
        val kato_voice4: MediaPlayer = MediaPlayer.create(this, R.raw.kato_nandakana)

        val button1: Button = findViewById(R.id.button1) as Button
        val button2: Button = findViewById(R.id.button2) as Button
        val button3: Button = findViewById(R.id.button3) as Button
        val button4: Button = findViewById(R.id.button4) as Button
        
        button1.setOnClickListener { view ->
            kato_voice1.start()
        }
        button2.setOnClickListener { view ->
            kato_voice2.start()
        }
        button3.setOnClickListener { view ->
            kato_voice3.start()
        }
        button4.setOnClickListener { view ->
            kato_voice4.start()
        }
    }
}
