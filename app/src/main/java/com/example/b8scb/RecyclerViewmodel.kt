package com.example.b8scb

import androidx.lifecycle.ViewModel

class RecyclerViewmodel:ViewModel() {

    var count = 0

    fun increment(){
        count++
    }
}