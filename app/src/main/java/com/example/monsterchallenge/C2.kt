package com.example.monsterchallenge

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.monsterchallenge.databinding.HItemBinding

class C2(private val dataSet: List<Meal>) :BaseAdapter<C2.ViewHolder>(dataSet) {

    class ViewHolder(view: View) : BaseViewHolder(view) {
        var binding=HItemBinding.bind(view)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.h_item, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(holder.binding.root).load(dataSet[position].linkPic)
            .into(holder.binding.photo)
        holder.binding.name.text=dataSet[position].name
    }

    override fun getItemCount() = dataSet.size

}
