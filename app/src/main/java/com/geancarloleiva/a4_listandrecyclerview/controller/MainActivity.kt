package com.geancarloleiva.a4_listandrecyclerview.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.geancarloleiva.a4_listandrecyclerview.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnListView: Button = findViewById(R.id.btnListView)
        btnListView.setOnClickListener{
            val listViewActivity = Intent(this, CategoryListViewActivity::class.java)
            startActivity(listViewActivity)
        }

        val btnRecyclerView: Button = findViewById(R.id.btnRecyclerView)
        btnRecyclerView.setOnClickListener{
            val recyclerViewActivity = Intent(this, CategoryRecyclerViewActivity::class.java)
            startActivity(recyclerViewActivity)
        }
    }
}