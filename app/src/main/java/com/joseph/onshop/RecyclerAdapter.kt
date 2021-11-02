package com.joseph.onshop

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import kotlinx.android.synthetic.main.single_item.view.*
import java.util.*
import kotlin.collections.ArrayList

class RecyclerAdapter(var context: Context, var newsList: ArrayList<NewsModel>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = newsList[position]

        holder.itemView.txt_title.text = item.title
        holder.itemView.txt_date.text = item.date
        holder.itemView.txt_desc.text = item.description
        holder.itemView.txt_title.text = item.title
        holder.itemView.imageView.setImageResource(item.image)
    }

    override fun getItemCount() = newsList.size
}