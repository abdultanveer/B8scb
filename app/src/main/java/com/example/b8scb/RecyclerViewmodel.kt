package com.example.b8scb

import android.os.CountDownTimer
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RecyclerViewmodel:ViewModel() {
    lateinit var timer: CountDownTimer
var TAG = RecyclerViewmodel::class.java.simpleName
    var count = 0
    var _seconds = MutableLiveData<Int>() //convert it innto observable
    //mutable data prefix it with _

    fun increment(){
        count++
    }

    fun startTimer(){
      timer = object : CountDownTimer(10_000,1_000){
          override fun onTick(millisUntilFinished: Long) {
              Log.i(TAG,"time remaining is --"+millisUntilFinished)
              _seconds.value = millisUntilFinished.toInt()
          }

          override fun onFinish() {
              Log.i(TAG,"timer completed")
          }

      }.start()
    }


}