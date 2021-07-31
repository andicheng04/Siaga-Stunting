package com.acxdev.stunting.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.acxdev.commonFunction.util.Preference.Companion.getPrefs
import com.acxdev.stunting.adapter.RowMenu
import com.acxdev.stunting.common.Constant
import com.acxdev.stunting.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth


class ActivityMain : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.menu.layoutManager = GridLayoutManager(this, 2)
        binding.menu.setHasFixedSize(true)
        val isMom = getPrefs().getString(Constant.ROLE, "mom") == "mom"
        binding.menu.adapter = RowMenu(Constant.menu(), isMom)

        binding.signOut.setOnClickListener {
            deleteAccount()
        }
    }

    private fun deleteAccount() {
        val firebaseAuth = FirebaseAuth.getInstance()
        val currentUser = firebaseAuth.currentUser
        currentUser!!.delete().addOnCompleteListener { task ->
            if (task.isSuccessful) {
                startActivity(Intent(this, ActivitySplash::class.java))
                finish()
            } else {
                Log.w("F", "Something is wrong!")
            }
        }
    }
}