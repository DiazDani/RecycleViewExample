package com.sopa.recycleviewexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sopa.recycleviewexample.R
import com.sopa.recycleviewexample.SuperHero

class superheroAdapter(val superheroList:List<SuperHero>) : RecyclerView.Adapter<superheroViewHolder>() {
    override fun getItemCount(): Int = superheroList.size



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): superheroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return superheroViewHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }

    override fun onBindViewHolder(holder: superheroViewHolder, position: Int) {
        val item = superheroList[position]
        holder.render(item)
    }
}