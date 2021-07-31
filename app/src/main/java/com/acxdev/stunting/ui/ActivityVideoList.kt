package com.acxdev.stunting.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.acxdev.stunting.R
import com.acxdev.stunting.adapter.RowVideoList
import com.acxdev.stunting.common.Constant
import com.acxdev.stunting.databinding.ActivityVideoListBinding

class ActivityVideoList : AppCompatActivity() {
    private lateinit var binding: ActivityVideoListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideoListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.list.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.list.setHasFixedSize(true)
        binding.list.adapter = RowVideoList(Constant.videoList())
    }
}