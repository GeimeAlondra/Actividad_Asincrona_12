package com.example.navegacion

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        // Recuperar todos los parámetros acumulados mediante Intent
        val departamento = intent.getStringExtra("DEPARTAMENTO") ?: ""
        val municipio    = intent.getStringExtra("MUNICIPIO")    ?: ""
        val distrito     = intent.getStringExtra("DISTRITO")     ?: ""

        val rutaCompleta = "$departamento – $municipio – $distrito"
        findViewById<TextView>(R.id.tvRuta).text = rutaCompleta

        findViewById<TextView>(R.id.tvDepartamento).text = "Departamento: $departamento"
        findViewById<TextView>(R.id.tvMunicipio).text    = "Municipio: $municipio"
        findViewById<TextView>(R.id.tvDistrito).text     = "Distrito: $distrito"

        findViewById<Button>(R.id.btnReinicio).setOnClickListener {
            val intent = Intent(this, DepartamentosActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }
    }
}