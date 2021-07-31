package com.acxdev.stunting.ui.mom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.acxdev.commonFunction.common.Language
import com.acxdev.commonFunction.util.Preference.Companion.putPrefs
import com.acxdev.commonFunction.util.view.TextInputLayoutX.Companion.alertEmpty
import com.acxdev.stunting.auth
import com.acxdev.stunting.child
import com.acxdev.stunting.common.Constant
import com.acxdev.stunting.database
import com.acxdev.stunting.databinding.ActivityMomLoginBinding
import com.acxdev.stunting.model.User
import com.acxdev.stunting.toast
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener

class ActivityMomLogin : AppCompatActivity() {
    private lateinit var binding: ActivityMomLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMomLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = database().getReference(Constant.USER)

        binding.next.setOnClickListener {
            if(binding.mail.alertEmpty(Language.ID) && binding.password.alertEmpty(Language.ID)){
                binding.progress.visibility = View.VISIBLE
                auth().signInWithEmailAndPassword(binding.mail.editText!!.text.toString(), binding.password.editText!!.text.toString()).addOnSuccessListener {
                    user.addListenerForSingleValueEvent(object : ValueEventListener {
                        override fun onDataChange(p0: DataSnapshot) {
                            if(p0.child(binding.mail.child()).exists()){
                                val users = p0.child(binding.mail.child()).getValue(User::class.java)!!
                                binding.progress.visibility = View.GONE
                                toast("Login Sukses")
                                putPrefs(Constant.USERNAME, binding.mail.child())
                                putPrefs(Constant.ROLE, users.role)
                                startActivity(Intent(this@ActivityMomLogin, ActivityMom3::class.java).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP))
                                finish()
                            }
                            else{
                                binding.progress.visibility = View.GONE
                                toast("Akun tidak ditemukan")
                            }
                        }

                        override fun onCancelled(p0: DatabaseError) {}
                    })
                }.addOnFailureListener {
                    binding.progress.visibility = View.GONE
                    toast("Login Failed - ${it.localizedMessage}")
                }
            }
        }
    }
}