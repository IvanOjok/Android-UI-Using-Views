package com.iv.cohort.model

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.iv.cohort.R


class MyListAdapter(val context: Context, val list:ArrayList<WhatsAppModel>): BaseAdapter() {
        override fun getCount(): Int {
            return list.size
        }

        override fun getItem(p0: Int): Any {
            return list[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            val view = LayoutInflater.from(context).inflate(R.layout.list_item_layout, null, false)
            val imageView = view.findViewById<ImageView>(R.id.image)
            val nameView = view.findViewById<TextView>(R.id.name)
            val messageView = view.findViewById<TextView>(R.id.message)
            val timeView =  view.findViewById<TextView>(R.id.time)

            imageView.setImageResource(list[p0].image)
            nameView.text = list[p0].name
            messageView.text = list[p0].message
            timeView.text = list[p0].time
            return view
        }

}
