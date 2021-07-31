package com.acxdev.stunting.ui.child

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.acxdev.commonFunction.common.Language
import com.acxdev.commonFunction.util.view.TextInputLayoutX.Companion.alertEmpty
import com.acxdev.commonFunction.util.view.TextInputLayoutX.Companion.datePicker
import com.acxdev.commonFunction.util.view.TextInputLayoutX.Companion.set
import com.acxdev.stunting.R
import com.acxdev.stunting.common.Constant
import com.acxdev.stunting.databinding.ActivityChildBinding
import com.acxdev.stunting.model.User
import com.google.gson.Gson

class ActivityChild : AppCompatActivity() {
    private lateinit var binding: ActivityChildBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChildBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.birthDate.setStartIconOnClickListener {
            binding.birthDate.datePicker("Tanggal Lahir","dd MMMM yyyy")
        }

        binding.gender.set(R.array.gender)
        binding.next.setOnClickListener {
            if(binding.name.alertEmpty(Language.ID) && binding.birthDate.alertEmpty(Language.ID) && binding.genderx.alertEmpty(Language.ID)){
                val user = User(binding.name.editText!!.text.toString(), binding.birthDate.editText!!.text.toString(), binding.gender.text.toString())
                startActivity(Intent(this, ActivityChild2::class.java).putExtra(Constant.DATA, Gson().toJson(user)))
            }
        }
    }
}