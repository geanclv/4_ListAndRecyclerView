package com.geancarloleiva.a4_listandrecyclerview.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.geancarloleiva.a4_listandrecyclerview.R
import com.geancarloleiva.a4_listandrecyclerview.adapter.CategoryRecyclerViewAdapter
import com.geancarloleiva.a4_listandrecyclerview.service.DataService

class CategoryRecyclerViewActivity : AppCompatActivity() {

    //Initiating the RecyclerViewAdapter
    lateinit var recycleViewAdapter: CategoryRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_recycler_view)

        val rcvCategory: RecyclerView = findViewById(R.id.rcvCategory)

        //Initializing the adapter
        recycleViewAdapter = CategoryRecyclerViewAdapter(this, DataService.lstCategory)
        //Assigning the adapter
        rcvCategory.adapter = recycleViewAdapter

        //Defining the layout
        val layoutManager = LinearLayoutManager(this)
        rcvCategory.layoutManager = layoutManager
        rcvCategory.setHasFixedSize(true)
    }
}