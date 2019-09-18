package com.codin.animations.thirdsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.codin.animations.R
import kotlinx.android.synthetic.main.activity_post_display.*

class PostDisplayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_display)
        // Now I guess we can start creating dummy data and try the animation :)

        // Ohh .. I didn't write the recyclerview
        val postList = ArrayList<Post>()
        postList.add(Post("Mohamed", "Some useless words"))
        postList.add(Post("Mohamed", "Some useless words"))
        postList.add(Post("Mohamed", "Some useless words"))
        postList.add(Post("Mohamed", "Some useless words"))
        postList.add(Post("Mohamed", "Some useless words"))
        postList.add(Post("Mohamed", "Some useless words"))
        postList.add(Post("Mohamed", "Some useless words"))
        postList.add(Post("Mohamed", "Some useless words"))
        postList.add(Post("Mohamed", "Some useless words"))
        postList.add(Post("Mohamed", "Some useless words"))
        postList.add(Post("Mohamed", "Some useless words"))
        postList.add(Post("Mohamed", "Some useless words"))
        postList.add(Post("Mohamed", "Some useless words"))
        postList.add(Post("Mohamed", "Some useless words"))
        postList.add(Post("Mohamed", "Some useless words"))
        postList.add(Post("Mohamed", "Some useless words"))
        rv.adapter = PostAdapter(this, postList, null)
        rv.layoutManager = LinearLayoutManager(this)
    }
}
