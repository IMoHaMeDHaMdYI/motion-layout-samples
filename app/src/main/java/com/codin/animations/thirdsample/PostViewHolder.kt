package com.codin.animations.thirdsample

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.post_item.view.*

class PostViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
    val personName = view.personName
    val content = view.postContent
    val motionLayout = view.postMotionLayout
}