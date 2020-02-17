package com.example.kadesubmission2.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kadesubmission2.R
import com.example.kadesubmission2.model.Match
import com.example.kadesubmission2.model.ResponseLastModel
import kotlinx.android.synthetic.main.item_match.view.*

class PrevMatchAdapter(val context: Context, val item: List<Match>) : RecyclerView.Adapter<PrevMatchAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(context).inflate(R.layout.item_match, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount() = item.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(item[position])
    }

    class ViewHolder(view:View) : RecyclerView.ViewHolder(view) {

        var strEventItemMatchTV : TextView = view.strEventItemMatchTV
        val strLeagueItemMatchTV = view.strLeagueItemMatchTV
        val intHomeScoreItemMatchTV = view.intHomeScoreItemMatchTV
        val intAwayScoreItemMatchTV = view.intAwayScoreItemMatchTV
        val dateEventItemMatchTV = view.dateEventItemMatchTV

        fun bindItem(item : Match){
            strEventItemMatchTV.text = item.strEvent
            strLeagueItemMatchTV.text = item.strLeague
            intHomeScoreItemMatchTV.text = item.idHomeTeam
            intAwayScoreItemMatchTV.text = item.idAwayTeam
            dateEventItemMatchTV.text = item.dateEvent

        }
    }
}