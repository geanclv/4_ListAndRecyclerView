package com.geancarloleiva.a4_listandrecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.geancarloleiva.a4_listandrecyclerview.R
import com.geancarloleiva.a4_listandrecyclerview.model.Category

class CategoryRecyclerViewAdapter(val context: Context, val lstCategory: List<Category>,
        val itemClick: (Category) -> Unit) //1. Lambda definition for the onClickListener: receives a Category and return void
    : RecyclerView.Adapter<CategoryRecyclerViewAdapter.ViewHolderRecycler>() {

    //Holder class needed to implement RecyclerView
    inner class ViewHolderRecycler(itemView: View?,
            val itemClick: (Category) -> Unit) //2. Adding the Lambda to the Holder class
        : RecyclerView.ViewHolder(itemView!!) {
        var categoryImage: ImageView = itemView!!.findViewById(R.id.imgCategory)
        var categoryName: TextView = itemView!!.findViewById(R.id.lblCategoryTitle)

        fun bindCategory(category: Category, context: Context){
            val imgId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImage.setImageResource(imgId)
            categoryName.setText(category.title)

            //3. Defining the behavior
            itemView.setOnClickListener{itemClick(category)}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderRecycler {
        val view = LayoutInflater.from(context).inflate(R.layout.category_list_item, parent, false)
        return ViewHolderRecycler(view, itemClick) //4. Update the call to the binder
    }

    override fun onBindViewHolder(holder: ViewHolderRecycler, position: Int) {
        holder.bindCategory(lstCategory[position], context)
    }

    override fun getItemCount(): Int {
        return lstCategory.count()
    }
}