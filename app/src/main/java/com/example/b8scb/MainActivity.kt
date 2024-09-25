package com.example.b8scb

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickHandler(view: View) {
        //add(10,20)
        Log.i("MainActivity","button clicked")
        var view = findViewById<ConstraintLayout>(R.id.main)
       // var snackbar =
            Snackbar.make(view,"1 archived",Snackbar.LENGTH_LONG)
                .setAction("undo",{})
                .show()
    }

    fun add(firstNo:Int, secondNo:Int):Int{
        return firstNo + secondNo
    }

}