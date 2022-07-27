package com.example.exam4tbc

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class AnimalsAdapter(private var animalsList:ArrayList<Animals>)
    : RecyclerView.Adapter<AnimalsAdapter.AnimalsViewHolder>(){

    var onItemClick : ((Animals) -> Unit)? = null

    class AnimalsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.sizeChoiceImgBtn)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return AnimalsViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnimalsViewHolder, position: Int) {
        val animals = animalsList[position]
        holder.imageView.setImageResource(animals.image)

        holder.itemView.setOnClickListener{
            onItemClick?.invoke(animals)
        }
    }

    override fun getItemCount(): Int {
        return animalsList.size
    }
}