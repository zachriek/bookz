package com.example.bookz

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bookz.book.BookAdapter
import com.example.bookz.book.BookConstant
import com.example.bookz.book.BookData
import com.example.bookz.category.CategoryData

class BookListActivity : AppCompatActivity() {
    private var booksRecycler: RecyclerView? = null
    private var bookAdapter = BookAdapter() { bookData: BookData ->
        handleNavigateToBrowser(bookData)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_list)

        booksRecycler = findViewById(R.id.books_recycler)

        booksRecycler?.layoutManager = LinearLayoutManager(this)
        booksRecycler?.adapter = this.bookAdapter

        val category = intent?.getSerializableExtra(MainActivity.EXTRA_CATEGORY) as CategoryData

        this.bookAdapter.submitList(BookConstant.getBookData().filter{it.categoryId == category.id})
    }

    private fun handleNavigateToBrowser(bookData: BookData) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=${bookData.title}"))
        startActivity(intent)
    }
}