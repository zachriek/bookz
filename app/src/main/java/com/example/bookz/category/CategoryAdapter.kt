package com.example.bookz.category

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.bookz.R

class CategoryAdapter(
    private val clickListener: (CategoryData) -> Unit
): ListAdapter<CategoryData, CategoryViewHolder>(
    CategoryDiffUtilCallback()
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(
            categoryItemView = LayoutInflater.from(parent.context).inflate(
                R.layout.category_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bindData(getItem(position))

        holder.itemView.setOnClickListener {
            clickListener(getItem(position))
        }
    }
}