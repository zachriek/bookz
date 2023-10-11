package com.example.bookz.book

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.bookz.R

class BookAdapter(
    private val clickListener: (BookData) -> Unit
): ListAdapter<BookData, BookViewHolder>(
    BookDiffUtilCallback()
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        return BookViewHolder(
            bookItemView = LayoutInflater.from(parent.context).inflate(
                R.layout.book_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        holder.bindData(getItem(position))

        holder.itemView.setOnClickListener {
            clickListener(getItem(position))
        }
    }
}