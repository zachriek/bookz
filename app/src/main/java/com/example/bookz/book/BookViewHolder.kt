package com.example.bookz.book

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.bookz.R
import com.google.android.material.textview.MaterialTextView

class BookViewHolder(
    private val bookItemView: View
): RecyclerView.ViewHolder(bookItemView) {
    private var title: MaterialTextView? = null
    private var author: MaterialTextView? = null
    private var image: ImageView? = null

    fun bindData(data: BookData) {
        title = bookItemView?.findViewById(R.id.book_item_title)
        author = bookItemView?.findViewById(R.id.book_item_author)
        image = bookItemView?.findViewById(R.id.book_item_image)

        title?.text = data.title
        author?.text = data.author
        image?.setImageResource(data.image)
    }
}