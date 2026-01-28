package com.adrianhelo.volumecalculator.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.adrianhelo.volumecalculator.R
import com.adrianhelo.volumecalculator.ui.models.Shape

class ShapeAdapter(context: Context, private val gridItems: List<Shape>):ArrayAdapter<Shape>(context, 0, gridItems) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView
        val holder: ViewHolder

        if (convertView == null){
            itemView = LayoutInflater.from(context).inflate(R.layout.volumes_list_view, parent, false)

            holder = ViewHolder()
            holder.imageView = itemView.findViewById(R.id.volumes_image_view)
            holder.textView = itemView.findViewById(R.id.volumes_text_view)

            itemView.tag = holder

        }else{
            holder = itemView?.tag as ViewHolder
        }

        val currentItem = gridItems[position]
        holder.imageView.setImageResource(currentItem.shapeImage)
        holder.textView.text = currentItem.shapeName

        return itemView!!
    }

    private class ViewHolder{
        lateinit var imageView: ImageView
        lateinit var textView: TextView
    }
}