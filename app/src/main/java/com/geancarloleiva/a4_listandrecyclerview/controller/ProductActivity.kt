package com.geancarloleiva.a4_listandrecyclerview.controller

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.geancarloleiva.a4_listandrecyclerview.R
import com.geancarloleiva.a4_listandrecyclerview.adapter.ProductRecyclerViewAdapter
import com.geancarloleiva.a4_listandrecyclerview.model.Category
import com.geancarloleiva.a4_listandrecyclerview.model.Product
import com.geancarloleiva.a4_listandrecyclerview.service.DataService
import com.geancarloleiva.a4_listandrecyclerview.util.EXTRA_CATEGORY_ID

class ProductActivity : AppCompatActivity() {

    lateinit var productAdapter: ProductRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY_ID).toString()
        println(categoryType)
        //You can use the category ID to filter the products to show (in this example no IDs filter exists)

        productAdapter = ProductRecyclerViewAdapter(this,
            DataService.getProductByCategoryTitle(categoryType)){ product ->
            Toast.makeText(this, "Seleccionó ${product.title}, su precio es ${product.price}",
                Toast.LENGTH_SHORT).show()
        }

        //Calculating the rows number based on the phone's orientation
        var spanCount = 2
        val orientation = resources.configuration.orientation
        if(orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }

        //Calculating the rows number based on the phone's size
        val screenSize = resources.configuration.screenWidthDp
        if(screenSize > 720){
            spanCount = 4 //for tablets
        }

        //Defining the layout manager and assigning to the RecyclerView frontend element
        val rcvProduct: RecyclerView = findViewById(R.id.rcvProduct)
        val layoutManager = GridLayoutManager(this, spanCount)
        rcvProduct.layoutManager = layoutManager
        rcvProduct.adapter = productAdapter
    }
}