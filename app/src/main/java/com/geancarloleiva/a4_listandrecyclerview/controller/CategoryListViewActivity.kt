package com.geancarloleiva.a4_listandrecyclerview.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import com.geancarloleiva.a4_listandrecyclerview.R
import com.geancarloleiva.a4_listandrecyclerview.adapter.CategoryListViewAdapter
import com.geancarloleiva.a4_listandrecyclerview.service.DataService

class CategoryListViewActivity : AppCompatActivity() {

    //Initiating with a simple ArrayAdapter
    //lateinit var arrAdapter : ArrayAdapter<Category>

    //Replacing the simple ArrayAdapter with my CategoryAdapter
    lateinit var categoryAdapter: CategoryListViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_list_view)

        val lsvCategory: ListView = findViewById(R.id.lsvCategory)

        //Initializing the adapter
        /*arrAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, //layout to display info
            DataService.lstCategory //data to be displayed
        )
        //Assigning the adapter to the listView item
        lsvCategory.adapter = arrAdapter*/

        //Replacing the simple ArrayAdapter with my CategoryAdapter
        categoryAdapter = CategoryListViewAdapter(this, DataService.lstCategory)
        lsvCategory.adapter = categoryAdapter

        //Actions when an item of the ListView is clicked
        lsvCategory.setOnItemClickListener { adapterView, view, i, l ->
            val category = DataService.lstCategory[i]
            Toast.makeText(this, "Category: ${category.title}", Toast.LENGTH_SHORT).show()
        }
    }
}