package com.example.wishlistand102_project2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val list: List<EachItem>): RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val itemName: TextView
        val itemPrice: TextView
        val whereToBuy: TextView

        init {
            itemName = itemView.findViewById(R.id.itemNameTv)
            itemPrice = itemView.findViewById(R.id.itemPriceTv)
            whereToBuy = itemView.findViewById(R.id.whereToBuyTv)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
         val context = parent.context

        val inflater = LayoutInflater.from(context)

        val itemView = inflater.inflate(R.layout.items, parent, false)

        return ViewHolder(itemView)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]

        holder.itemName.text = item.name
        holder.itemPrice.text = item.price
        holder.whereToBuy.text = item.whereToBuy

    }

}