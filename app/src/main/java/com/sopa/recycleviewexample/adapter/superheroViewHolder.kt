package com.sopa.recycleviewexample.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sopa.recycleviewexample.R
import com.sopa.recycleviewexample.SuperHero

class superheroViewHolder (view: View):RecyclerView.ViewHolder(view){

    val superHero = view.findViewById<TextView>(R.id.tvSuperHeroName)
    val publisher = view.findViewById<TextView>(R.id.tvPublisher)
    val realName = view.findViewById<TextView>(R.id.tvRealName)
    val photo = view.findViewById<ImageView>(R.id.ivSuperHero)
    fun render(superHeroModel: SuperHero){
        superHero.text=superHeroModel.superhero
        realName.text=superHeroModel.realName
        publisher.text=superHeroModel.publisher

    }
}