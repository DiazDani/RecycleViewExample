package com.sopa.recycleviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sopa.recycleviewexample.adapter.superheroAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
    }
    private fun initRecyclerView(){
        val recyclerView= findViewById<RecyclerView>(R.id.recycleSuperHero)
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.adapter= superheroAdapter(SuperheroProvider.superHeroList)

    }
}