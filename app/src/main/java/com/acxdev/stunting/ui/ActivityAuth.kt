package com.acxdev.stunting.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.acxdev.stunting.R
import com.acxdev.stunting.common.Constant
import com.acxdev.stunting.ui.child.ActivityChild
import com.acxdev.stunting.ui.child.ActivityChildLogin
import com.acxdev.stunting.ui.mom.ActivityMom
import com.acxdev.stunting.ui.mom.ActivityMomLogin

class ActivityAuth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        findViewById<View>(R.id.child).setOnClickListener {
            if(intent.getStringExtra(Constant.DATA) != null) startActivity(Intent(this, ActivityChildLogin::class.java))
            else startActivity(Intent(this, ActivityChild::class.java))
        }
        findViewById<View>(R.id.mom).setOnClickListener {
            if(intent.getStringExtra(Constant.DATA) != null) startActivity(Intent(this, ActivityMomLogin::class.java))
            else startActivity(Intent(this, ActivityMom::class.java))
        }
    }
}