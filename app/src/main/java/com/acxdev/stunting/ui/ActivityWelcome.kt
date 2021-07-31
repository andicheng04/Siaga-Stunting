package com.acxdev.stunting.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.acxdev.stunting.R
import com.acxdev.stunting.common.Constant

class ActivityWelcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        findViewById<TextView>(R.id.signIn).setOnClickListener {
            startActivity(Intent(this, ActivityAuth::class.java).putExtra(Constant.DATA, "signIn"))
        }
        findViewById<TextView>(R.id.signUp).setOnClickListener {
            startActivity(Intent(this, ActivityAuth::class.java))
        }
    }
}