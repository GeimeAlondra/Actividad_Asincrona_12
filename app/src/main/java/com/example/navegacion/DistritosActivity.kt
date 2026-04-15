package com.example.navegacion

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.navegacion.R
import com.example.navegacion.ResultadoActivity

class DistritosActivity : AppCompatActivity() {

    private val distritosPorMunicipio = mapOf(

        "Ahuachapán Norte" to arrayOf(
            "Atiquizaya", "El Refugio", "San Lorenzo", "Turín"
        ),
        "Ahuachapán Centro" to arrayOf(
            "Ahuachapán", "Apaneca", "Concepción de Ataco", "Tacuba"
        ),
        "Ahuachapán Sur" to arrayOf(
            "Guaymango", "Jujutla", "San Francisco Menéndez", "San Pedro Puxtla"
        ),

        "Cabañas Este" to arrayOf(
            "Sensuntepeque", "Victoria", "Dolores", "Guacotecti", "San Isidro"
        ),
        "Cabañas Oeste" to arrayOf(
            "Ilobasco", "Tejutepeque", "Jutiapa", "Cinquera"
        ),

        "Chalatenango Norte" to arrayOf(
            "La Palma", "Citalá", "San Ignacio"
        ),
        "Chalatenango Centro" to arrayOf(
            "Nueva Concepción", "Tejutla", "La Reina", "Agua Caliente",
            "Dulce Nombre de María", "El Paraíso", "San Fernando",
            "San Francisco Morazán", "San Rafael", "Santa Rita"
        ),
        "Chalatenango Sur" to arrayOf(
            "Chalatenango", "Arcatao", "Azacualpa", "Comalapa",
            "Concepción Quezaltepeque", "El Carrizal", "La Laguna",
            "Las Vueltas", "Nombre de Jesús", "Nueva Trinidad", "Ojos de Agua",
            "Potonico", "San Antonio de la Cruz", "San Antonio Los Ranchos",
            "San Francisco Lempa", "San Isidro Labrador", "San José Cancasque",
            "San José Las Flores", "San Luis del Carmen", "San Miguel de Mercedes"
        ),

        "Cuscatlán Norte" to arrayOf(
            "Suchitoto", "San José Guayabal", "Oratorio de Concepción",
            "San Bartolomé Perulapía", "San Pedro Perulapán"
        ),
        "Cuscatlán Sur" to arrayOf(
            "Cojutepeque", "San Rafael Cedros", "Candelaria", "Monte San Juan",
            "El Carmen", "San Cristóbal", "Santa Cruz Michapa",
            "San Ramón", "El Rosario", "Santa Cruz Analquito", "Tenancingo"
        ),

        "La Libertad Norte" to arrayOf(
            "Quezaltepeque", "San Matías", "San Pablo Tacachico"
        ),
        "La Libertad Centro" to arrayOf(
            "San Juan Opico", "Ciudad Arce"
        ),
        "La Libertad Oeste" to arrayOf(
            "Colón", "Jayaque", "Sacacoyo", "Tepecoyo", "Talnique"
        ),
        "La Libertad Este" to arrayOf(
            "Antiguo Cuscatlán", "Huizúcar", "Nuevo Cuscatlán",
            "San José Villanueva", "Zaragoza"
        ),
        "La Libertad Costa" to arrayOf(
            "Chiltiupán", "Jicalapa", "La Libertad", "Tamanique", "Teotepeque"
        ),
        "La Libertad Sur" to arrayOf(
            "Comasagua", "Santa Tecla"
        ),

        "La Paz Oeste" to arrayOf(
            "Cuyultitán", "Olocuilta", "San Juan Talpa", "San Luis Talpa",
            "San Pedro Masahuat", "Tapalhuaca", "San Francisco Chinameca"
        ),
        "La Paz Centro" to arrayOf(
            "El Rosario", "Jerusalén", "Mercedes La Ceiba", "Paraíso de Osorio",
            "San Antonio Masahuat", "San Emigdio", "San Juan Tepezontes",
            "San Luis La Herradura", "San Miguel Tepezontes",
            "San Pedro Nonualco", "Santa María Ostuma", "Santiago Nonualco"
        ),
        "La Paz Este" to arrayOf(
            "San Juan Nonualco", "San Rafael Obrajuelo", "Zacatecoluca"
        ),

        "La Unión Norte" to arrayOf(
            "Anamorós", "Bolívar", "Concepción de Oriente", "El Sauce",
            "Lislique", "Nueva Esparta", "Pasaquina", "Polorós",
            "San José La Fuente", "Santa Rosa de Lima"
        ),
        "La Unión Sur" to arrayOf(
            "Conchagua", "El Carmen", "Intipucá", "La Unión",
            "Meanguera del Golfo", "San Alejo", "Yayantique", "Yucuaiquín"
        ),

        "Morazán Norte" to arrayOf(
            "Arambala", "Cacaopera", "Corinto", "El Rosario", "Joateca",
            "Jocoaitique", "Meanguera", "Perquín", "San Fernando",
            "San Isidro", "Torola"
        ),
        "Morazán Sur" to arrayOf(
            "Chilanga", "Delicias de Concepción", "El Divisadero", "Gualococti",
            "Guatajiagua", "Jocoro", "Lolotiquillo", "Osicala", "San Carlos",
            "San Francisco Gotera", "San Simón", "Sensembra",
            "Sociedad", "Yamabal", "Yoloaiquín"
        ),

        "San Miguel Norte" to arrayOf(
            "Ciudad Barrios", "Sesori", "Nuevo Edén de San Juan", "San Gerardo",
            "San Luis de la Reina", "Carolina", "San Antonio del Mosco", "Chapeltique"
        ),
        "San Miguel Centro" to arrayOf(
            "San Miguel", "Comacarán", "Uluazapa",
            "Moncagua", "Quelepa", "Chirilagua"
        ),
        "San Miguel Oeste" to arrayOf(
            "Chinameca", "Nueva Guadalupe", "Lolotique",
            "San Jorge", "San Rafael Oriente", "El Tránsito"
        ),

        "San Salvador Norte" to arrayOf(
            "Aguilares", "El Paisnal", "Guazapa"
        ),
        "San Salvador Oeste" to arrayOf(
            "Apopa", "Nejapa"
        ),
        "San Salvador Este" to arrayOf(
            "Ilopango", "San Martín", "Soyapango", "Tonacatepeque"
        ),
        "San Salvador Centro" to arrayOf(
            "Ayutuxtepeque", "Mejicanos", "San Salvador",
            "Cuscatancingo", "Ciudad Delgado"
        ),
        "San Salvador Sur" to arrayOf(
            "Panchimalco", "Rosario de Mora", "San Marcos",
            "Santo Tomás", "Santiago Texacuangos"
        ),

        "San Vicente Norte" to arrayOf(
            "Apastepeque", "Santa Clara", "San Ildefonso",
            "San Esteban Catarina", "San Sebastián", "San Lorenzo", "Santo Domingo"
        ),
        "San Vicente Sur" to arrayOf(
            "San Vicente", "Guadalupe", "Verapaz",
            "Tepetitán", "Tecoluca", "San Cayetano Istepeque"
        ),

        "Santa Ana Norte" to arrayOf(
            "Masahuat", "Metapán", "Santa Rosa Guachipilín", "Texistepeque"
        ),
        "Santa Ana Centro" to arrayOf(
            "Santa Ana"
        ),
        "Santa Ana Este" to arrayOf(
            "Coatepeque", "El Congo"
        ),
        "Santa Ana Oeste" to arrayOf(
            "Candelaria de la Frontera", "Chalchuapa", "El Porvenir",
            "San Antonio Pajonal", "San Sebastián Salitrillo", "Santiago de la Frontera"
        ),

        "Sonsonate Norte" to arrayOf(
            "Juayúa", "Nahuizalco", "Salcoatitán", "Santa Catarina Masahuat"
        ),
        "Sonsonate Centro" to arrayOf(
            "Sonsonate", "Sonzacate", "Nahulingo",
            "San Antonio del Monte", "Santo Domingo de Guzmán"
        ),
        "Sonsonate Este" to arrayOf(
            "Izalco", "Armenia", "Caluco",
            "San Julián", "Cuisnahuat", "Santa Isabel Ishuatán"
        ),
        "Sonsonate Oeste" to arrayOf(
            "Acajutla"
        ),

        "Usulután Norte" to arrayOf(
            "Santiago de María", "Alegría", "Berlín", "Mercedes Umaña",
            "Jucuapa", "El Triunfo", "Estanzuelas", "San Buenaventura", "Nueva Granada"
        ),
        "Usulután Este" to arrayOf(
            "Usulután", "Jucuarán", "San Dionisio", "Concepción Batres",
            "Santa María", "Ozatlán", "Tecapán", "Santa Elena",
            "California", "Ereguayquín"
        ),
        "Usulután Oeste" to arrayOf(
            "Jiquilisco", "Puerto El Triunfo", "San Agustín", "San Francisco Javier"
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_distritos)

        val departamento = intent.getStringExtra("Departamento") ?: ""
        val municipio    = intent.getStringExtra("Municipio")    ?: ""

        findViewById<TextView>(R.id.tvTitulo).text = "Distritos de $municipio"

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val distritos = distritosPorMunicipio[municipio]
            ?: arrayOf("Sin datos disponibles")

        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, distritos)

        listView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, ResultadoActivity::class.java)
            intent.putExtra("Departamento", departamento)
            intent.putExtra("Municipio",    municipio)
            intent.putExtra("Distrito",     distritos[position])
            startActivity(intent)
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}