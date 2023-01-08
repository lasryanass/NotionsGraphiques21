package com.tp2.notionsgraphiques21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gridView = GridView(this)
        gridView.numColumns = 2

        val names = listOf("Yassine HAMDANE", "Ghita SALAME", "Adnane EL BOUHALI", "Anass LASRY")

        setContentView(gridView)

        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_gallery_item,names)

        gridView.adapter = arrayAdapter
        gridView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, position, id ->
            val selectedItem = adapterView.getItemAtPosition(position) as String
            Toast.makeText(applicationContext,"The name $selectedItem has been clicked.", Toast.LENGTH_SHORT).show()
        }
    }
}

