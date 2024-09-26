package com.example.b8scb

import android.os.Bundle
import android.view.View
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.b8scb.database.Item
import com.example.b8scb.database.ItemDao
import com.example.b8scb.database.ItemRoomDatabase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class RecyclerActivity : AppCompatActivity() {
    var languages = arrayOf("English","hindi","urdu","kannada","tamil")
    lateinit var recyclerView: RecyclerView

    lateinit var dao: ItemDao


    lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        recyclerView = findViewById(R.id.recyclerview)
recyclerView.layoutManager = LinearLayoutManager(this)
        var adapter = LangsAdapter(languages)
        recyclerView.adapter = adapter

        var database = ItemRoomDatabase.getDatabase(this)
        dao = database.itemDao()





    }

    fun insertDb(view: View) {

        GlobalScope.launch {  //launch = coroutine
            var gItem = Item(11, "fruits", 12.99, 12)

            dao.insert(gItem)

        }
    }
}