package com.example.bookz

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bookz.book.BookAdapter
import com.example.bookz.book.BookConstant
import com.example.bookz.book.BookData
import com.example.bookz.category.CategoryData
import com.example.bookz.databinding.ActivityBookListBinding
import com.example.bookz.databinding.ActivityMainBinding

class BookListActivity : AppCompatActivity(), OnClickListener {
    private lateinit var binding: ActivityBookListBinding
    private var layoutManager: GridLayoutManager = GridLayoutManager(this, 1)
    private var bookAdapter = BookAdapter(layoutManager) { bookData: BookData ->
        handleNavigateToBrowser(bookData)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookListBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.booksRecycler.layoutManager = layoutManager
        binding.booksRecycler.adapter = this.bookAdapter

        val category = intent?.getSerializableExtra(MainActivity.EXTRA_CATEGORY) as CategoryData

        this.bookAdapter.submitList(BookConstant.getBookData().filter{it.categoryId == category.id})

        binding.bookGridIcon.bringToFront()
        binding.bookGridIcon.setOnClickListener(this)
    }

    private fun handleNavigateToBrowser(bookData: BookData) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Buku ${bookData.title}"))
        startActivity(intent)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.book_grid_icon -> {
                handleSwitchLayout()
                handleSwitchIcon()
            }
        }
    }

    private fun handleSwitchLayout() {
        if (layoutManager.spanCount == 1) {
            layoutManager.spanCount = 2
        } else {
            layoutManager.spanCount = 1
        }
        bookAdapter.notifyItemRangeChanged(0, bookAdapter?.itemCount ?: 0)
    }

    private fun handleSwitchIcon() {
        if (layoutManager.spanCount == 1) {
            binding.bookGridIcon.setImageResource(R.drawable.ic_grid)
        } else {
            binding.bookGridIcon.setImageResource(R.drawable.ic_grid_off)
        }
    }
}