package com.example.api_interface

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MyPersonalAdapter(val context : Activity , val productsData : List<Product>?) : RecyclerView.Adapter<MyPersonalAdapter.MyViewHolder>()
{
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.custom_layout_tj,p0,false)
        return MyViewHolder(view)
    }

    @SuppressLint("CheckResult")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Glide.with(context).load(productsData?.get(position)?.thumbnail).into(holder.image)
        holder.title.text = "Title : ${productsData?.get(position)?.title}"
        holder.category.text = "Category : ${productsData?.get(position)?.category}"
        holder.brand.text = "Brand : ${productsData?.get(position)?.brand}"
        holder.price.text = "Price : ${productsData?.get(position)?.price.toString()}"
        holder.ratingBar.rating = productsData?.get(position)?.rating?.toFloat()!!
    }

    override fun getItemCount(): Int {
        return productsData?.size?: 0
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

            val image = itemView.findViewById<ImageView>(R.id.image_tj)
            val title = itemView.findViewById<TextView>(R.id.title_tj)
            val category = itemView.findViewById<TextView>(R.id.category_tj)
            val brand = itemView.findViewById<TextView>(R.id.brand_tj)
            val price = itemView.findViewById<TextView>(R.id.price_tj)
            val ratingBar = itemView.findViewById<RatingBar>(R.id.ratingBar_tj)
    }
}