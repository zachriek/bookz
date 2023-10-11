package com.example.bookz.book

data class BookData(
    val id: String,
    val categoryId: String,
    val title: String,
    val author: String,
    var image: Int
)
