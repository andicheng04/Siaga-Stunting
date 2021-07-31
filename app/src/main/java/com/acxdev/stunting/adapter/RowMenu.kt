package com.acxdev.stunting.adapter

import android.content.Intent
import com.acxdev.commonFunction.adapter.BaseAdapter
import com.acxdev.stunting.databinding.RowMenuBinding
import com.acxdev.stunting.model.Menu
import com.acxdev.stunting.ui.ActivityPengolahanPangan
import com.acxdev.stunting.ui.ActivityRecipe
import com.acxdev.stunting.ui.ActivityVideoList
import com.acxdev.stunting.ui.child.ActivityGiziChild
import com.acxdev.stunting.ui.mom.ActivityGiziMom

class RowMenu(private val list: MutableList<Menu>, private val isMom: Boolean) :
    BaseAdapter<RowMenuBinding, Menu>(RowMenuBinding::inflate, list) {
    override fun onBindViewHolder(holder: ViewHolder<RowMenuBinding>, position: Int) {
        val list = list[position]
        holder.binding.imageView.setImageResource(list.image)
        holder.binding.textView.text = list.text
        holder.itemView.setOnClickListener {
            when (position) {
                0 -> context.startActivity(Intent(context, ActivityVideoList::class.java))
                1 -> context.startActivity(Intent(context, ActivityRecipe::class.java))
                2 -> context.startActivity(Intent(context, ActivityPengolahanPangan::class.java))
                3 -> {
                    if (isMom) context.startActivity(Intent(context, ActivityGiziMom::class.java))
                    else context.startActivity(Intent(context, ActivityGiziChild::class.java))
                }
            }
        }

    }
}