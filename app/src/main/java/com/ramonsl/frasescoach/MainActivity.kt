package com.ramonsl.frasescoach

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnFrase = findViewById<Button>(R.id.btnFrase)
        btnFrase.setOnClickListener(View.OnClickListener {
            gerar(btnFrase)
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