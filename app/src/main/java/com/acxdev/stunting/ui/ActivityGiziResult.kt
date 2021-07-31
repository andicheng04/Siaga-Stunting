package com.acxdev.stunting.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.acxdev.commonFunction.util.Preference.Companion.getPrefs
import com.acxdev.stunting.R
import com.acxdev.stunting.common.Constant
import com.acxdev.stunting.databinding.ActivityGiziResultBinding
import com.acxdev.stunting.ui.child.Count

class ActivityGiziResult : AppCompatActivity() {
    private lateinit var binding: ActivityGiziResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGiziResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val isMom = getPrefs().getString(Constant.ROLE, "mom") == "mom"

        if (isMom) {
            val result = intent.getStringExtra(Constant.DATA)!!.toDouble()
            when {
                result < 18.5 -> binding.image.setImageResource(R.drawable.ic_mom_gizi_low)
                result in 18.5..25.0 -> binding.image.setImageResource(R.drawable.ic_mom_gizi_normal)
                else -> binding.image.setImageResource(R.drawable.ic_mom_gizi_over)
            }
            println("IMT $result")
        }
        else{
            when(intent.getStringExtra(Constant.DATA)){
                "Sangat Kurus" -> binding.image.setImageResource(R.drawable.ic_child_gizi_low)
                "Kurus" -> binding.image.setImageResource(R.drawable.ic_child_gizi_low)
                "Normal" -> binding.image.setImageResource(R.drawable.ic_child_gizi_normal)
                "Gemuk" -> binding.image.setImageResource(R.drawable.ic_child_gizi_over)
            }
        }
    }
}