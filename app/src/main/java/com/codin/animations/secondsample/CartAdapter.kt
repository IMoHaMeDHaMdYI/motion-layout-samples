package com.codin.animations.secondsample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.codin.animations.R
import kotlinx.android.synthetic.main.plate_item.view.*

class CartAdapter(private val context: Context, private val plateUrlList: ArrayList<String>)
    : RecyclerView.Adapter<CartAdapter.PlateViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlateViewHolder {
        return PlateViewHolder(LayoutInflater.from(context).inflate(R.layout.plate_item, parent, false))
    }

    override fun getItemCount(): Int {
        return plateUrlList.size
    }


    override fun onBindViewHolder(holder: PlateViewHolder, position: Int) {
        Glide.with(context)
                .load(plateUrlList[position])
                .into(holder.img)
        holder.motion.transitionToEnd()
    }

    class PlateViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val img = view.img
        val motion = view.plate
    }

    fun add(imgUrl: String) {
        plateUrlList.add(imgUrl)
        notifyItemInserted(plateUrlList.size - 1)
    }
}