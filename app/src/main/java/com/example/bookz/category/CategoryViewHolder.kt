package com.example.bookz.category

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.bookz.R
import com.google.android.material.textview.MaterialTextView

class CategoryViewHolder(
    private val categoryItemView: View,
    private val viewType: Int
): RecyclerView.ViewHolder(categoryItemView) {
    private var name: MaterialTextView? = null
    private var image: ImageView? = null

    fun bindData(data: CategoryData) {
        if (viewType == CategoryAdapter.ViewType.LINEAR.ordinal) {
            name = categoryItemView.findViewById(R.id.category_item_name)
            image = categoryItemView.findViewById(R.id.category_item_image)

            name?.text = data.name
            image?.setImageResource(data.image)
        } else {
            name = categoryItemView.findViewById(R.id.category_item_name_grid)
            image = categoryItemView.findViewById(R.id.category_item_image_grid)

            name?.text = data.name
            image?.setImageResource(data.image)
        }
    }
}