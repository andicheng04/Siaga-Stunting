package com.acxdev.stunting.ui.mom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.acxdev.commonFunction.common.Language
import com.acxdev.commonFunction.util.view.TextInputLayoutX.Companion.alertEmpty
import com.acxdev.commonFunction.util.view.TextInputLayoutX.Companion.datePicker
import com.acxdev.stunting.common.Constant
import com.acxdev.stunting.databinding.ActivityMomBinding
import com.acxdev.stunting.model.User
import com.google.gson.Gson

class ActivityMom : AppCompatActivity() {
    private lateinit var binding: ActivityMomBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMomBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        binding.birthDate.setStartIconOnClickListener {
            binding.birthDate.datePicker("Tanggal Lahir","dd MMMM yyyy")
        }

        binding.next.setOnClickListener {
            if(binding.name.alertEmpty(Language.ID) && binding.birthDate.alertEmpty(Language.ID) && binding.pregnant.alertEmpty(Language.ID)){
                val user = User(binding.name.editText!!.text.toString(), binding.birthDate.editText!!.text.toString(), "Perempuan", null, null,
                    binding.pregnant.editText!!.text.toString())
                startActivity(Intent(this, ActivityMom2::class.java).putExtra(Constant.DATA, Gson().toJson(user)))
            }
        }
    }
}