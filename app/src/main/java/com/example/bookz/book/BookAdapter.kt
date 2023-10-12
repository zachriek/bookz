package com.example.bookz.book

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.ListAdapter
import com.example.bookz.R
import com.example.bookz.category.CategoryAdapter

class BookAdapter(
    private val layoutManager: GridLayoutManager,
    private val clickListener: (BookData) -> Unit
): ListAdapter<BookData, BookViewHolder>(
    BookDiffUtilCallback()
) {
    enum class ViewType {
        GRID,
        LINEAR
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        return BookViewHolder(
            LayoutInflater.from(parent.context).inflate(
                if (viewType == BookAdapter.ViewType.LINEAR.ordinal) R.layout.book_item else R.layout.book_item_grid,
                parent,
                false
            ),
            viewType
        )
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        holder.bindData(getItem(position))

        holder.itemView.setOnClickListener {
            clickListener(getItem(position))
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (layoutManager.spanCount == 2) BookAdapter.ViewType.GRID.ordinal else BookAdapter.ViewType.LINEAR.ordinal
    }
}