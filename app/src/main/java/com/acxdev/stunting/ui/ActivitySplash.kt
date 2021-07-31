package com.acxdev.stunting.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.acxdev.stunting.auth
import com.acxdev.stunting.databinding.ActivitySplashBinding

class ActivitySplash : AppCompatActivity() {
    var second = 0
    lateinit var runnable: Runnable
    lateinit var handler: Handler
    lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        handler = Handler(Looper.getMainLooper())
        runnable = object : Runnable {
            override fun run() {
                if (second < 100) {
                    second += 1
                    binding.progressHorizontal.progress = second
                    handler.postDelayed(this, 50)
                } else {
                    if (savedInstanceState == null) {
                        //pass to welcome
                        val i = Intent(this@ActivitySplash, if(auth().currentUser != null) ActivityMain::class.java else ActivityWelcome::class.java)
                        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
                        startActivity(i)
                        finish()
                    }
                }
            }
        }
        runnable.run()
    }
}