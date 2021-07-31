package com.acxdev.stunting

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.acxdev.stunting.common.Constant
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase


fun database(): FirebaseDatabase = FirebaseDatabase.getInstance(Constant.BASE_URL)

fun auth(): FirebaseAuth = FirebaseAuth.getInstance()

fun TextInputLayout.child(): String{
    val mail = editText!!.text.toString().split("@")
    return mail[0]
}


fun AppCompatActivity.toast(alert: String){
    Toast.makeText(this, alert, Toast.LENGTH_LONG).show()
}

fun Fragment.toast(alert: String){
    Toast.makeText(context, alert, Toast.LENGTH_LONG).show()
}