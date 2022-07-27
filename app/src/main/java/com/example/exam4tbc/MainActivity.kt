package com.example.exam4tbc

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var list: ArrayList<Animals>
    private lateinit var animalsAdapter: AnimalsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerViewID)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        list = ArrayList()

        list.add(Animals(R.drawable.three))
        list.add(Animals(R.drawable.four))
        list.add(Animals(R.drawable.five))

        animalsAdapter = AnimalsAdapter(list)
        recyclerView.adapter = animalsAdapter



        animalsAdapter.onItemClick = {
            val intent = Intent(this, DetailedActivity::class.java)
            intent.putExtra("animals", it)
            startActivity(intent)
        }
    }
}


