package com.example.notcollapsingappbar.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.notcollapsingappbar.R
import com.example.notcollapsingappbar.viewholders.ViewHolder1
import com.example.notcollapsingappbar.viewholders.ViewHolderHorizontal

class AdapterHorizontal : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolderHorizontal(
            LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {}

    override fun getItemCount() = 5

    override fun getItemViewType(position: Int) = R.layout.list_item_horizontal
}