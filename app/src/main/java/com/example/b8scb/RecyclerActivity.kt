package com.example.b8scb

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RecyclerActivity : AppCompatActivity() {
    var languages = arrayOf("English","hindi","urdu","kannada","tamil")

    lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        listView = findViewById(R.id.listView)

        var adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,languages)
        listView.adapter = adapter

    }
}