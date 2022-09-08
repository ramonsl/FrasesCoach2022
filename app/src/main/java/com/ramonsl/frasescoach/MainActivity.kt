package com.ramonsl.frasescoach

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.ramonsl.frasescoach.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnFrase.setOnClickListener({
            gerar(binding.btnFrase)
        })
    }


    fun gerar(view: View){
        val sorteio = Random.nextInt(0,3 )
        Log.i("Sorteio","numero sorteado: $sorteio")
        val frases =resources.getTextArray(R.array.frases)
        var txt = findViewById<TextView>(R.id.txtFrase)
        txt.text= frases[sorteio]
        Log.i("Sorteio","numero sorteado:" +frases[sorteio])
    }


}