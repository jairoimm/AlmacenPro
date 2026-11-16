package com.jairo.almacenpro

import android.content.Intent
import android.widget.Button
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class DetalleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_detalle)

        val btnEditar = findViewById<Button>(R.id.btnEditar)
        val btnEliminar = findViewById<Button>(R.id.btnEliminar)

        btnEditar.setOnClickListener {

            startActivity(
                Intent(this, IaActivity::class.java)
            )

        }

        btnEliminar.setOnClickListener {

            finish()

        }
    }
}