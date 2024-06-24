package com.nikapps.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val itemList: List<CustomItem>) :
    RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_image, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val item = itemList[position]
        holder.bind(item)
    }

    override fun getItemCount() = itemList.size

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.itemImageView)
        private val textView: TextView = itemView.findViewById(R.id.itemTextView)
        private val checkBox: CheckBox = itemView.findViewById(R.id.itemCheckBox)

        fun bind(item: CustomItem) {
            textView.text = item.text
            checkBox.isChecked = item.isChecked
            imageView.setImageResource(item.imageResId)

            checkBox.setOnCheckedChangeListener { _, isChecked ->
                item.isChecked = isChecked
            }
        }
    }
}
