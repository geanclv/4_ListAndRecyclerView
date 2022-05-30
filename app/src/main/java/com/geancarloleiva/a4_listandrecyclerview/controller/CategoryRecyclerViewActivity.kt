package com.geancarloleiva.a4_listandrecyclerview.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.geancarloleiva.a4_listandrecyclerview.R
import com.geancarloleiva.a4_listandrecyclerview.adapter.CategoryRecyclerViewAdapter
import com.geancarloleiva.a4_listandrecyclerview.service.DataService
import com.geancarloleiva.a4_listandrecyclerview.util.EXTRA_CATEGORY_ID

class CategoryRecyclerViewActivity : AppCompatActivity() {

    //Initiating the RecyclerViewAdapter
    lateinit var recycleViewAdapter: CategoryRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_recycler_view)

        val rcvCategory: RecyclerView = findViewById(R.id.rcvCategory)

        //Initializing the adapter
        //recycleViewAdapter = CategoryRecyclerViewAdapter(this, DataService.lstCategory)
        //5. Replacing the old call to Adapter, for a new on
        recycleViewAdapter = CategoryRecyclerViewAdapter(this, DataService.lstCategory) { category ->
            val productIntent = Intent(this, ProductActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY_ID, category.title)
            startActivity(productIntent)
        }
        //Assigning the adapter
        rcvCategory.adapter = recycleViewAdapter

        //Defining the layout
        val layoutManager = LinearLayoutManager(this)
        rcvCategory.layoutManager = layoutManager
        rcvCategory.setHasFixedSize(true)

        //Using Lambdas to create the clickListener
        //1. We add the Lambda definition in the Adapter's constructor
        //2. Add the Lambda to the Holder inner class
        //3. Define the behavior on the bind method (in inner class)
        //4. Update the call to the binder on "onCreateViewHolder"
        //5. Change the call to the Adapter
    }
}