package com.acxdev.stunting.ui.mom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.acxdev.commonFunction.common.Language
import com.acxdev.commonFunction.util.view.TextInputLayoutX.Companion.alertEmpty
import com.acxdev.stunting.common.Constant
import com.acxdev.stunting.databinding.ActivityGiziMomBinding
import com.acxdev.stunting.ui.ActivityGiziResult

class ActivityGiziMom : AppCompatActivity() {
    private lateinit var binding: ActivityGiziMomBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGiziMomBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.next.setOnClickListener {
            if(binding.height.alertEmpty(Language.ID) && binding.weight.alertEmpty(Language.ID)){
                val height = binding.height.editText!!.text.toString().toDouble() / 100
                val weight = binding.weight.editText!!.text.toString().toDouble()
                val imt = weight / (height * height)
                startActivity(Intent(this, ActivityGiziResult::class.java).putExtra(Constant.DATA, imt.toString()))
            }
        }
    }
}