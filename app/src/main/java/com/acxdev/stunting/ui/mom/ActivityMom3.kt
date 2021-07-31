package com.acxdev.stunting.ui.mom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.acxdev.stunting.R
import com.acxdev.stunting.common.Constant
import com.acxdev.stunting.ui.ActivityMain

class ActivityMom3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mom3)
        findViewById<ImageView>(R.id.image).setOnClickListener {
            startActivity(Intent(this, ActivityMain::class.java))
        }
    }
}