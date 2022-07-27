package com.example.exam4tbc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.example.exam4tbc.Animals

class DetailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)


        val q : ImageButton = findViewById(R.id.q)
        val w : ImageButton = findViewById(R.id.w)
        val e : ImageButton = findViewById(R.id.e)
        val r : ImageButton = findViewById(R.id.r)
        val t : ImageButton = findViewById(R.id.t)
        val y : ImageButton = findViewById(R.id.y)
        val u : ImageButton = findViewById(R.id.u)
        val i : ImageButton = findViewById(R.id.i)
        val o : ImageButton = findViewById(R.id.o)
        val p : ImageButton = findViewById(R.id.p)
        val a : ImageButton = findViewById(R.id.a)
        val s : ImageButton = findViewById(R.id.s)
        val d : ImageButton = findViewById(R.id.d)
        val f : ImageButton = findViewById(R.id.f)
        val g : ImageButton = findViewById(R.id.g)
        val h : ImageButton = findViewById(R.id.h)
        val j : ImageButton = findViewById(R.id.j)
        val k : ImageButton = findViewById(R.id.k)
        val l : ImageButton = findViewById(R.id.l)
        val z : ImageButton = findViewById(R.id.z)
        val x : ImageButton = findViewById(R.id.x)
        val c : ImageButton = findViewById(R.id.c)
        val v : ImageButton = findViewById(R.id.v)
        val b : ImageButton = findViewById(R.id.b)
        val n : ImageButton = findViewById(R.id.n)


        if (threeClicked){
            var index : Int = 0
            var variable : Int = R.drawable.x
            if (xClicked) variable = R.drawable.x
            else if (oCkicked) variable = R.drawable.zero
            q.setOnClickListener{q.setImageResource(variable)}
        }





    }
}