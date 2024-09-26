package com.example.b8scb

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LangsAdapter(var languages: Array<String>) :RecyclerView.Adapter<LangsAdapter.VisitingCardsHolder>() {
var TAG = LangsAdapter::class.java.simpleName
    var noTimesBalaMarket = 0

    class VisitingCardsHolder( visitingCard:View):RecyclerView.ViewHolder(visitingCard) {
        var tvCard:TextView = visitingCard.findViewById(R.id.tvVisitingcard)
        init {
            Log.i("VisitingCardsHolder","sangeetha received card from bala")
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VisitingCardsHolder {
        noTimesBalaMarket++

        Log.i(TAG,"bala --bought a visiting card from market"+noTimesBalaMarket)
        var vistingCard = LayoutInflater.from(parent.context).inflate(R.layout.visiting_card,parent,false)
        return VisitingCardsHolder(vistingCard)
    }

    override fun getItemCount(): Int {
        Log.i(TAG,"masthan is counting")
        return languages.size
    }

    override fun onBindViewHolder(vholder: VisitingCardsHolder, position: Int) {
        Log.i(TAG,"ismail is writing on the vcard -"+languages.get(position))
        vholder.tvCard.setText(languages.get(position))

    }
}