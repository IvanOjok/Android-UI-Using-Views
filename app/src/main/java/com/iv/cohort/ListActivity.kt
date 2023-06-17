package com.iv.cohort

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ListView
import com.iv.cohort.model.MyListAdapter
import com.iv.cohort.model.WhatsAppModel

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val list = ArrayList<WhatsAppModel>()
        list.add(WhatsAppModel(R.drawable.account, "Ivan", "Hi there, How are You", "09:00"))
        list.add(WhatsAppModel(R.drawable.account, "Agrey", "Hi, Could we meet at 1pm", "07:00"))

        val myAdapter = MyListAdapter(this, list)
        val myList = findViewById<ListView>(R.id.my_list)
        myList.adapter = myAdapter

    }

//    inner class MyInsideListAdapter(val context: Context, val list:ArrayList<WhatsAppModel>): BaseAdapter() {
//        override fun getCount(): Int {
//            return list.size
//        }
//
//        override fun getItem(p0: Int): Any {
//            return list[p0]
//        }
//
//        override fun getItemId(p0: Int): Long {
//            return p0.toLong()
//        }
//
//        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
//            val view = LayoutInflater.from(this@ListActivity)
//        }
//
//    }
}