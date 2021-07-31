package com.acxdev.stunting.adapter

import android.app.Activity
import com.acxdev.commonFunction.adapter.BaseAdapter
import com.acxdev.commonFunction.util.FunctionX.Companion.webView
import com.acxdev.commonFunction.util.view.OtherViewX.Companion.backgroundTint
import com.acxdev.stunting.R
import com.acxdev.stunting.databinding.RowListBinding
import com.acxdev.stunting.model.Video

class RowVideoList(private val list: MutableList<Video>) :
    BaseAdapter<RowListBinding, Video>(RowListBinding::inflate, list) {
    override fun onBindViewHolder(holder: ViewHolder<RowListBinding>, position: Int) {
        val list = list[position]
        holder.binding.number.text = (position + 1).toString()
        holder.binding.title.text = list.title
        if (position % 2 == 0){
            holder.binding.number.backgroundTint(R.color.num1)
            holder.binding.title.backgroundTint(R.color.num2)
        } else {
            holder.binding.number.backgroundTint(R.color.num2)
            holder.binding.title.backgroundTint(R.color.num1)
        }

        holder.itemView.setOnClickListener {
            (context as Activity).webView(list.url, R.color.red)
        }
    }
}