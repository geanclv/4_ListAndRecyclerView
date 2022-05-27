package com.geancarloleiva.a4_listandrecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.geancarloleiva.a4_listandrecyclerview.R
import com.geancarloleiva.a4_listandrecyclerview.model.Category

class CategoryAdapter(context: Context, lstCategory: List<Category>) : BaseAdapter() {

    val context = context
    val lstCategory = lstCategory

    override fun getCount(): Int {
        return lstCategory.count()
    }

    override fun getItem(position: Int): Any {
        return lstCategory[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        //Initializing the view
        val categoryView: View

        //Working with the ViewHolder, that optimize and recycle the components that where created while we navigate in the screen
        val holder: ViewHolder
        if(convertView == null){
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()

            holder.categoryImage = categoryView.findViewById(R.id.imgCategory)
            holder.categoryName = categoryView.findViewById(R.id.lblCategoryTitle)

            categoryView.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

        //Getting the object values
        val category = lstCategory[position]
        val imgId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(imgId)
        holder.categoryName?.setText(category.title)

        return categoryView
    }
}

private class ViewHolder {
    var categoryImage: ImageView? = null
    var categoryName: TextView? = null
}