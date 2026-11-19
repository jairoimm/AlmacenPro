package com.jairo.almacenpro

import android.widget.Button
import android.widget.Toast
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity



class IaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_ia)

        val btnConsultarIA = findViewById<Button>(R.id.btnConsultarIA)

        btnConsultarIA.setOnClickListener {

            Toast.makeText(
                this,
                R.string.consulta_procesada,
                Toast.LENGTH_SHORT
            ).show()

        }
    }
}