package com.acxdev.stunting.ui.mom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.acxdev.commonFunction.common.Language
import com.acxdev.commonFunction.util.view.TextInputLayoutX.Companion.alertEmpty
import com.acxdev.stunting.auth
import com.acxdev.stunting.child
import com.acxdev.stunting.common.Constant
import com.acxdev.stunting.database
import com.acxdev.stunting.databinding.ActivityMom2Binding
import com.acxdev.stunting.model.User
import com.acxdev.stunting.toast
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.gson.Gson

class ActivityMom2 : AppCompatActivity() {
    private lateinit var binding: ActivityMom2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMom2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = Gson().fromJson(intent.getStringExtra(Constant.DATA), User::class.java)
        val user = database().getReference(Constant.USER)

        binding.next.setOnClickListener {
            if(binding.mail.alertEmpty(Language.ID) && binding.phone.alertEmpty(Language.ID) && binding.password.alertEmpty(Language.ID)){
                val users = User(data.name, data.birthDate, data.gender, binding.mail.editText!!.text.toString(), binding.phone.editText!!.text.toString(), data.pregnant, "mom")
                binding.progress.visibility = View.VISIBLE
                auth().createUserWithEmailAndPassword(users.mail!!, binding.password.editText!!.text.toString()).addOnSuccessListener {
                    user.addListenerForSingleValueEvent(object : ValueEventListener{
                        override fun onDataChange(p0: DataSnapshot) {
                            binding.progress.visibility = View.GONE
                            if(p0.child(binding.mail.child()).exists()){
                                toast("Email sudah digunakan")
                            } else{
                                user.child(binding.mail.child()).setValue(users)
                                toast("Pendaftaran Berhasil")
                                startActivity(Intent(this@ActivityMom2, ActivityMomLogin::class.java))
                            }
                        }

                        override fun onCancelled(p0: DatabaseError) {}

                    })
                }.addOnFailureListener {
                    binding.progress.visibility = View.GONE
                    toast("Register failed - ${it.localizedMessage}")
                }
            }
        }
    }
}