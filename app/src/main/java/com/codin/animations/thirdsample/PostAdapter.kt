package com.codin.animations.thirdsample

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codin.animations.R

class PostAdapter(val context: Context, val postList: ArrayList<Post>, val onPostClicked: IOnPostClicked?) :
    RecyclerView.Adapter<PostViewHolder>() {

    interface IOnPostClicked {
        fun onPostClicked()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        return PostViewHolder(LayoutInflater.from(context).inflate(R.layout.post_item, parent, false))
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = postList[position]
        holder.apply {
            if (post.clicked) {
                motionLayout.progress = 1f
            } else {
                motionLayout.progress = 0f
            }
            personName.text = post.name
            content.text = post.content
            itemView.setOnClickListener {
                motionLayout.transitionToEnd()
                postList[position].clicked = true
            }
        }
    }

}