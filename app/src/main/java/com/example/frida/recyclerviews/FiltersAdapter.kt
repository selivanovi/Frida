package com.example.frida.recyclerviews

import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.frida.R

class FiltersAdapter(val onClickListener: (Bitmap) -> Unit, var bitmap: Bitmap?) :
    RecyclerView.Adapter<FiltersAdapter.ViewHolder>() {

    private val filtersList = mutableListOf<Bitmap>()

    fun setData(list: List<Bitmap>) {
        with(filtersList) {
            clear()
            addAll(list)
        }
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_filter, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageBitmap(filtersList[position])
        holder.imageView.setOnClickListener {
            onClickListener(filtersList[position])
        }
    }

    override fun getItemCount(): Int {
        return filtersList.size
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView = view.findViewById<ImageView>(R.id.filterItem)
    }
}