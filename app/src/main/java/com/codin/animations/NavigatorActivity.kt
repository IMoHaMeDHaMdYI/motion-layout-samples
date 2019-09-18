package com.codin.animations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.codin.animations.firstsample.MainActivity
import com.codin.animations.model.Sample
import com.codin.animations.secondsample.PlateSampleActivity
import com.codin.animations.thirdsample.PostDisplayActivity
import kotlinx.android.synthetic.main.activity_navigator.*

class NavigatorActivity : AppCompatActivity(), SampleAdapter.ClickListener {
    override fun onClicked(cls: Class<out AppCompatActivity>) {
        startActivity(Intent(this, cls))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigator)
        val ar = arrayListOf(Sample(MainActivity::class.java.simpleName, MainActivity::class.java)
                , Sample(PlateSampleActivity::class.java.simpleName, PlateSampleActivity::class.java),
                Sample(PostDisplayActivity::class.java.simpleName, PostDisplayActivity::class.java)
        )
        val sm = SampleAdapter(this, ar, this)
        rv.apply {
            layoutManager = LinearLayoutManager(this@NavigatorActivity)
            adapter = sm
        }
    }
}
