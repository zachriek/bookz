package com.example.bookz2.book

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.bookz2.R
import com.google.android.material.textview.MaterialTextView

class BookViewHolder(
    private val bookItemView: View,
    private val viewType: Int
): RecyclerView.ViewHolder(bookItemView) {
    private var title: MaterialTextView? = null
    private var author: MaterialTextView? = null
    private var image: ImageView? = null

    fun bindData(data: BookData) {
        if (viewType == BookAdapter.ViewType.LINEAR.ordinal) {
            title = bookItemView?.findViewById(R.id.book_item_title)
            author = bookItemView?.findViewById(R.id.book_item_author)
            image = bookItemView?.findViewById(R.id.book_item_image)
        } else {
            title = bookItemView?.findViewById(R.id.book_item_title_grid)
            author = bookItemView?.findViewById(R.id.book_item_author_grid)
            image = bookItemView?.findViewById(R.id.book_item_image_grid)
        }

        title?.text = data.title
        author?.text = data.author
        image?.setImageResource(data.image)
    }
}