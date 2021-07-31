package com.acxdev.stunting.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.acxdev.stunting.R
import com.acxdev.stunting.adapter.RowText
import com.acxdev.stunting.common.Constant
import com.acxdev.stunting.databinding.ActivityMpasiBinding

class ActivityMpasi : AppCompatActivity() {
    private lateinit var binding: ActivityMpasiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMpasiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recipe.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.recipe.setHasFixedSize(true)

        when (intent.getStringExtra(Constant.DATA)) {
            "1" -> {
                binding.mpasi.text = "MPASI 6-8 bulan"
                binding.recipe.adapter = RowText(Constant.mpasi6to8month())
            }
            "2" -> {
                binding.mpasi.text = "MPASI 9-11 bulan"
                binding.recipe.adapter = RowText(Constant.mpasi9to11month())
            }
            "3" -> {
                binding.mpasi.text = "MPASI 12-13 bulan"
                binding.recipe.adapter = RowText(Constant.mpasi12to13month())
            }
        }
    }
}