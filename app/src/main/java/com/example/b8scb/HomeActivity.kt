package com.example.b8scb

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import coil.load
import com.example.b8scb.networking.MarsApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class HomeActivity : AppCompatActivity() {
    var product: Int = 20
var TAG = HomeActivity::class.java.simpleName
    lateinit var imgView: ImageView
    lateinit var homeView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        homeView = findViewById(R.id.tvHome)
        imgView = findViewById(R.id.imageView)
        //get intent which started this activity
        //retreive extras fromm that inntent
        //get the string with the key myname


        //set it onnto a textview
    }

    fun setAlarm(view: View?) {
        createAlarm("b9scb", 13, 52)
    }

    fun createAlarm(message: String?, hour: Int, minutes: Int) {
        val intent = Intent(AlarmClock.ACTION_SET_ALARM)
            .putExtra(AlarmClock.EXTRA_MESSAGE, message)
            .putExtra(AlarmClock.EXTRA_HOUR, hour)
            .putExtra(AlarmClock.EXTRA_MINUTES, minutes)
        // if (intent.resolveActivity(getPackageManager()) != null) {
        startActivity(intent)
    }


    fun getJson(view: View?) {
        GlobalScope.launch(Dispatchers.Main) {
            val listResult = MarsApi.retrofitService.getPhotos()
            var imgUrl = listResult.get(0).imgSrc
            Log.i(TAG,imgUrl)
            Log.i(TAG,"no of items ="+ listResult.size)
            imgView.load(imgUrl)
        }
    }
}