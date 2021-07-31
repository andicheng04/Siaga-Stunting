package com.acxdev.stunting.ui.child

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.acxdev.commonFunction.common.Language
import com.acxdev.commonFunction.util.Preference.Companion.getPrefs
import com.acxdev.commonFunction.util.view.TextInputLayoutX.Companion.alertEmpty
import com.acxdev.stunting.common.Constant
import com.acxdev.stunting.databinding.ActivityGiziChildBinding
import com.acxdev.stunting.ui.ActivityGiziResult

class ActivityGiziChild : AppCompatActivity() {
    private lateinit var binding: ActivityGiziChildBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGiziChildBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.next.setOnClickListener {
            if(binding.age.alertEmpty(Language.ID) && binding.weight.alertEmpty(Language.ID) && binding.height.alertEmpty(Language.ID)){
                val result = Count.countBBTB(getPrefs().getString(Constant.GENDER, "Laki-laki"), binding.height.editText!!.text.toString(), binding.weight.editText!!.text.toString(),
                    binding.age.editText!!.text.toString())
                startActivity(Intent(this, ActivityGiziResult::class.java).putExtra(Constant.DATA, result))
            }
        }
    }
}