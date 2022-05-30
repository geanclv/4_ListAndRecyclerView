package com.geancarloleiva.a4_listandrecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.geancarloleiva.a4_listandrecyclerview.R
import com.geancarloleiva.a4_listandrecyclerview.model.Product

class ProductRecyclerViewAdapter(val context: Context, val lstProduct: List<Product>,
        val itemClick: (Product) -> Unit)
    : RecyclerView.Adapter<ProductRecyclerViewAdapter.ProductHolder>() {

        inner class ProductHolder(itemView: View?,
                itemClick: (Product) -> Unit)
            : RecyclerView.ViewHolder(itemView!!){
            val imgProduct: ImageView = itemView!!.findViewById(R.id.imgProduct)
            val lblProductTitle: TextView = itemView!!.findViewById(R.id.lblProductTitle)
            val lblProductPrice: TextView = itemView!!.findViewById(R.id.lblProductPrice)

            fun bindProduct(context: Context, product: Product){
                val imgId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
                imgProduct.setImageResource(imgId)
                lblProductTitle.setText(product.title)
                lblProductPrice.setText(product.price)

                itemView.setOnClickListener{itemClick(product)}
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
        return ProductHolder(view, itemClick)
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.bindProduct(context, lstProduct[position])
    }

    override fun getItemCount(): Int {
        return lstProduct.count()
    }
}