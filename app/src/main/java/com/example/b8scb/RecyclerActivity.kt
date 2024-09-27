package com.example.b8scb

import android.os.Bundle
import android.view.View
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.b8scb.database.Item
import com.example.b8scb.database.ItemDao
import com.example.b8scb.database.ItemRoomDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

class RecyclerActivity : AppCompatActivity() {
    var languages = arrayOf("English","hindi","urdu","kannada","tamil")
    lateinit var recyclerView: RecyclerView
   // var count = 0  //data fetched from db/webservice
lateinit var  tv: TextView //convert this tv into an observer
    lateinit var dao: ItemDao
    lateinit var viewModel:RecyclerViewmodel



    lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        viewModel = ViewModelProvider(this)[RecyclerViewmodel::class.java]

        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        var adapter = LangsAdapter(languages)
        recyclerView.adapter = adapter
         tv = findViewById(R.id.tvDb)
         tv.setText(""+viewModel._seconds)


        var database = ItemRoomDatabase.getDatabase(this)
        dao = database.itemDao()





    }

    fun insertDb(view: View) {

        GlobalScope.launch {  //launch = coroutine
            var gItem = Item(11, "fruits", 12.99, 12)

            dao.insert(gItem)

        }
    }

    fun getDb(view: View) {
        GlobalScope.launch(Dispatchers.Main) {
            var item =  dao.getItem(11).first()
            var tv: TextView = findViewById(R.id.tvDb)
            tv.setText(item.itemName)
        }

    }

    fun increment(view: View) {
       viewModel.increment()
        tv.setText(""+viewModel.count)

    }
}