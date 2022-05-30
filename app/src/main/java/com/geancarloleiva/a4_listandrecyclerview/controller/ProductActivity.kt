package com.geancarloleiva.a4_listandrecyclerview.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geancarloleiva.a4_listandrecyclerview.R
import com.geancarloleiva.a4_listandrecyclerview.model.Category
import com.geancarloleiva.a4_listandrecyclerview.util.EXTRA_CATEGORY_ID

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY_ID)
        println(categoryType)
        //You can use the category ID to filter the products to show (in this example no IDs filter exists)
    }
}