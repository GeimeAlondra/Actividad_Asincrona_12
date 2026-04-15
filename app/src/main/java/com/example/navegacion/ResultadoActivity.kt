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

        val departamento = intent.getStringExtra("Departamento") ?: ""
        val municipio    = intent.getStringExtra("Municipio")    ?: ""
        val distrito     = intent.getStringExtra("Distrito")     ?: ""

        val rutaCompleta = "$departamento – $municipio – $distrito"
        findViewById<TextView>(R.id.tvRuta).text = rutaCompleta

        findViewById<TextView>(R.id.tvDepartamento).text = "$departamento"
        findViewById<TextView>(R.id.tvMunicipio).text    = "$municipio"
        findViewById<TextView>(R.id.tvDistrito).text     = "$distrito"

        findViewById<Button>(R.id.btnReinicio).setOnClickListener {
            val intent = Intent(this, DepartamentosActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}