package com.example.monsterchallenge

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.monsterchallenge.databinding.HRecycleBinding
import com.example.monsterchallenge.databinding.VItemBinding


class CustomAdapter(private val dataSet: List<Meal>) : BaseAdapter<BaseAdapter.BaseViewHolder>(dataSet) {

    class ViewHolder(view: View) : BaseViewHolder(view) {
        val binding= VItemBinding.bind(view)
    }
    class HeaderViewHolder(view: View) : BaseViewHolder(view) {
        val binding= HRecycleBinding.bind(view)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): BaseViewHolder {
        return if(viewType==100) HeaderViewHolder(LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.h_recycle, viewGroup, false))
        else ViewHolder(LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.v_item, viewGroup, false))
    }
    override fun getItemViewType(position: Int): Int {
        return if(position==0) 100 else 200
    }
    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        if(holder is HeaderViewHolder){
            holder.binding.recycle.adapter=C2(Arrays.ARRAY_OF_MEAL)
        }
        else if (holder is ViewHolder){
            holder.binding.mealName.text=dataSet[position].name
            Glide.with(holder.itemView.context).load(dataSet[position].linkPic).into(holder.binding.photo)
        }
    }
}
