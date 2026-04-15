package com.example.navegacion

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.navegacion.R.id
import com.example.navegacion.DistritosActivity

class MunicipiosActivity : AppCompatActivity() {

    private val municipiosPorDepartamento = mapOf(
        "Ahuachapán" to arrayOf(
            "Ahuachapán Norte",
            "Ahuachapán Centro",
            "Ahuachapán Sur"
        ),
        "Cabañas" to arrayOf(
            "Cabañas Este",
            "Cabañas Oeste"
        ),
        "Chalatenango" to arrayOf(
            "Chalatenango Norte",
            "Chalatenango Centro",
            "Chalatenango Sur"
        ),
        "Cuscatlán" to arrayOf(
            "Cuscatlán Norte",
            "Cuscatlán Sur"
        ),
        "La Libertad" to arrayOf(
            "La Libertad Norte",
            "La Libertad Centro",
            "La Libertad Oeste",
            "La Libertad Este",
            "La Libertad Costa",
            "La Libertad Sur"
        ),
        "La Paz" to arrayOf(
            "La Paz Oeste",
            "La Paz Centro",
            "La Paz Este"
        ),
        "La Unión" to arrayOf(
            "La Unión Norte",
            "La Unión Sur"
        ),
        "Morazán" to arrayOf(
            "Morazán Norte",
            "Morazán Sur"
        ),
        "San Miguel" to arrayOf(
            "San Miguel Norte",
            "San Miguel Centro",
            "San Miguel Oeste"
        ),
        "San Salvador" to arrayOf(
            "San Salvador Norte",
            "San Salvador Oeste",
            "San Salvador Este",
            "San Salvador Centro",
            "San Salvador Sur"
        ),
        "San Vicente" to arrayOf(
            "San Vicente Norte",
            "San Vicente Sur"
        ),
        "Santa Ana" to arrayOf(
            "Santa Ana Norte",
            "Santa Ana Centro",
            "Santa Ana Este",
            "Santa Ana Oeste"
        ),
        "Sonsonate" to arrayOf(
            "Sonsonate Norte",
            "Sonsonate Centro",
            "Sonsonate Este",
            "Sonsonate Oeste"
        ),
        "Usulután" to arrayOf(
            "Usulután Norte",
            "Usulután Este",
            "Usulután Oeste"
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_municipios)

        val departamento = intent.getStringExtra("DEPARTAMENTO") ?: ""

        findViewById<TextView>(id.tvTitulo).text = "Municipios de $departamento"

        val municipios = municipiosPorDepartamento[departamento]
            ?: arrayOf("Sin datos disponibles")

        val listView = findViewById<ListView>(id.listView)
        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, municipios)

        listView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, DistritosActivity::class.java)
            intent.putExtra("DEPARTAMENTO", departamento)
            intent.putExtra("MUNICIPIO", municipios[position])
            startActivity(intent)
        }
    }
}