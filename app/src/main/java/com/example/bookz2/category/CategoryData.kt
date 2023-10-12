package com.example.bookz2.category

import java.io.Serializable

data class CategoryData(
    val id: String,
    val name: String,
    val image: Int
): Serializable
