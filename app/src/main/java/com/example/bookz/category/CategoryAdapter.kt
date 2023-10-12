package com.example.bookz.category

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.bookz.R

class CategoryAdapter(
    private val layoutManager: GridLayoutManager,
    private val clickListener: (CategoryData) -> Unit
): ListAdapter<CategoryData, CategoryViewHolder>(
    CategoryDiffUtilCallback()
) {
    enum class ViewType {
        GRID,
        LINEAR
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(
            LayoutInflater.from(parent.context).inflate(
                if (viewType == ViewType.LINEAR.ordinal) R.layout.category_item else R.layout.category_item_grid,
                parent,
                false
            ),
            viewType
        )
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bindData(getItem(position))

        holder.itemView.setOnClickListener {
            clickListener(getItem(position))
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (layoutManager.spanCount == 2) ViewType.GRID.ordinal else ViewType.LINEAR.ordinal
    }
}