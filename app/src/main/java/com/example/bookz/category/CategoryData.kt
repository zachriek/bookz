package com.example.bookz.category

import java.io.Serializable

data class CategoryData(
    val id: String,
    val name: String,
    val image: Int
): Serializable
