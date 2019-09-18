package com.codin.animations

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.codin.animations.model.Sample
import kotlinx.android.synthetic.main.sample_view_holder.view.*

class SampleAdapter(private val context: Context, private val sampleList: ArrayList<Sample>,
                    private val clickListener: ClickListener) : RecyclerView.Adapter<SampleAdapter.SampleViewHolder>() {
    interface ClickListener {
        fun onClicked(cls: Class<out AppCompatActivity>)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleViewHolder {
        return SampleViewHolder(LayoutInflater.from(context).inflate(R.layout.sample_view_holder, parent, false))

    }

    override fun getItemCount(): Int {
        return sampleList.size
    }

    override fun onBindViewHolder(holder: SampleViewHolder, position: Int) {
        val sample = sampleList[position]
        holder.txt.text = sample.activityName
        holder.itemView.setOnClickListener {
            clickListener.onClicked(sample.activityClass)
        }
    }

    class SampleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txt = view.activity_name
    }
}