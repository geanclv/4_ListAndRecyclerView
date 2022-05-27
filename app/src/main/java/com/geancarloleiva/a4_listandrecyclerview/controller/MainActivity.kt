package com.geancarloleiva.a4_listandrecyclerview.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.geancarloleiva.a4_listandrecyclerview.R
import com.geancarloleiva.a4_listandrecyclerview.model.Category
import com.geancarloleiva.a4_listandrecyclerview.service.DataService

class MainActivity : AppCompatActivity() {

    //Initiating with a simple ArrayAdapter
    lateinit var arrAdapter : ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        arrAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, //layout to display info
            DataService.lstCategory //data to be displayed
        )

        //Assigning the adapter to the listView item
        val lsvCategory: ListView = findViewById(R.id.lsvCategory)
        lsvCategory.adapter = arrAdapter
    }
}