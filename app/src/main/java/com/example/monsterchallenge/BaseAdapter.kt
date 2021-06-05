package com.example.monsterchallenge

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

abstract class BaseAdapter<VH: BaseAdapter.BaseViewHolder>(val list: List<Meal>):RecyclerView.Adapter<VH>() {
    abstract  class BaseViewHolder(view: View): RecyclerView.ViewHolder(view)

    abstract override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH

    override fun getItemCount()=list.size

    abstract override fun onBindViewHolder(holder: VH, position: Int)

}