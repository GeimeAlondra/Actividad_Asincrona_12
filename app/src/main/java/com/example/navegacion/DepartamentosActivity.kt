package com.example.navegacion

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DepartamentosActivity : AppCompatActivity() {

    private val departamentos = arrayOf(
        "Ahuachapán", "Cabañas", "Chalatenango", "Cuscatlán",
        "La Libertad", "La Paz", "La Unión", "Morazán",
        "San Miguel", "San Salvador", "San Vicente",
        "Santa Ana", "Sonsonate", "Usulután"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_departamentos)

        findViewById<TextView>(R.id.tvTitulo).text = "Selecciona un departamento"

        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, departamentos)

        listView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, MunicipiosActivity::class.java)
            intent.putExtra("Departamento", departamentos[position])
            startActivity(intent)
        }
    }
}