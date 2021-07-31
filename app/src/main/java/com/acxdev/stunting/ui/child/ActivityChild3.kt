package com.acxdev.stunting.ui.child

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.acxdev.stunting.R
import com.acxdev.stunting.common.Constant
import com.acxdev.stunting.ui.ActivityMain

class ActivityChild3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child3)
        findViewById<ImageView>(R.id.image).setOnClickListener {
            startActivity(Intent(this, ActivityMain::class.java))
        }
    }
}