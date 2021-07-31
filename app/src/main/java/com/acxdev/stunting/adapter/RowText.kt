package com.acxdev.stunting.adapter

import android.content.Intent
import com.acxdev.commonFunction.adapter.BaseAdapter
import com.acxdev.stunting.common.Constant
import com.acxdev.stunting.databinding.RowTextBinding
import com.acxdev.stunting.ui.ActivityMenu

class RowText(private val list: MutableList<String>) :
    BaseAdapter<RowTextBinding, String>(RowTextBinding::inflate, list) {
    override fun onBindViewHolder(holder: ViewHolder<RowTextBinding>, position: Int) {
        val list = list[position]
        holder.binding.textView.text = list
        holder.binding.textView.setOnClickListener {
            context.startActivity(Intent(context, ActivityMenu::class.java).putExtra(Constant.DATA, list))
        }
    }
}