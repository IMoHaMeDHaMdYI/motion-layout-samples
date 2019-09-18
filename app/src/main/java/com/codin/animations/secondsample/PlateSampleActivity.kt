package com.codin.animations.secondsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.HORIZONTAL
import com.bumptech.glide.Glide
import com.codin.animations.R
import kotlinx.android.synthetic.main.activity_plate_sample.*
import kotlinx.android.synthetic.main.plate_item.*

class PlateSampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plate_sample)
        val s = "https://image.ibb.co/n4JqCz/Featured_Food_2x_500x550_Taco_Salad.png"
        val ar = arrayListOf(s)
        val adapter = CartAdapter(this, ArrayList())
        platesRv.adapter = adapter
        platesRv.layoutManager = LinearLayoutManager(this, HORIZONTAL, false)
        addPlate.setOnClickListener {
            plateMotionLayout.transitionToEnd()
            adapter.add(s)
        }
    }
}
