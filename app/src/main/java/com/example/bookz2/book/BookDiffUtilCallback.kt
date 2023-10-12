package com.example.bookz2.book

import androidx.recyclerview.widget.DiffUtil

class BookDiffUtilCallback: DiffUtil.ItemCallback<BookData>() {
    override fun areItemsTheSame(oldItem: BookData, newItem: BookData): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: BookData, newItem: BookData): Boolean {
        return oldItem.id == newItem.id
    }
}