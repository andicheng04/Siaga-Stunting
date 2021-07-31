package com.acxdev.stunting.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.acxdev.stunting.R
import com.acxdev.stunting.common.Constant

class ActivityRecipe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)
        findViewById<TextView>(R.id.mpasi6to8month).setOnClickListener {
            startActivity(Intent(this, ActivityMpasi::class.java).putExtra(Constant.DATA, "1"))
        }
        findViewById<TextView>(R.id.mpasi9to11month).setOnClickListener {
            startActivity(Intent(this, ActivityMpasi::class.java).putExtra(Constant.DATA, "2"))
        }
        findViewById<TextView>(R.id.mpasi12to13month).setOnClickListener {
            startActivity(Intent(this, ActivityMpasi::class.java).putExtra(Constant.DATA, "3"))
        }
    }
}