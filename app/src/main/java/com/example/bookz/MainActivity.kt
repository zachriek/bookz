package com.example.bookz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bookz.category.CategoryAdapter
import com.example.bookz.category.CategoryConstant
import com.example.bookz.category.CategoryData

class MainActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_CATEGORY = "extra_category"
    }

    private var categoryRecycler: RecyclerView? = null
    private var categoryAdapter = CategoryAdapter() { categoryData: CategoryData ->
        handleNavigateToBookList(categoryData)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        categoryRecycler = findViewById(R.id.category_recycler)

        categoryRecycler?.layoutManager = LinearLayoutManager(this)
        categoryRecycler?.adapter = this.categoryAdapter

        this.categoryAdapter.submitList(CategoryConstant.getCategoryData())
    }

    private fun handleNavigateToBookList(categoryData: CategoryData) {
        val intent = Intent(this, BookListActivity::class.java)
        intent.putExtra(EXTRA_CATEGORY, categoryData)
        startActivity(intent)
    }
}