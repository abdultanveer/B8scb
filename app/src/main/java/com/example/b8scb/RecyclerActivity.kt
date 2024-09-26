package com.example.b8scb

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerActivity : AppCompatActivity() {
    var languages = arrayOf("English","hindi","urdu","kannada","tamil")
    lateinit var recyclerView: RecyclerView

    lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        recyclerView = findViewById(R.id.recyclerview)
recyclerView.layoutManager = LinearLayoutManager(this)
        var adapter = LangsAdapter(languages)
        recyclerView.adapter = adapter



    }
}