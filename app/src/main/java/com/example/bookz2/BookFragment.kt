package com.example.bookz2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.bookz2.book.BookAdapter
import com.example.bookz2.book.BookConstant
import com.example.bookz2.book.BookData
import com.example.bookz2.databinding.BookFragmentBinding

class BookFragment: Fragment(), OnClickListener {
    private lateinit var binding: BookFragmentBinding
    private var layoutManager: GridLayoutManager = GridLayoutManager(view?.context, 1)
    private var bookAdapter = BookAdapter(layoutManager) { bookData: BookData ->
        handleNavigateToGoogle(bookData)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = BookFragmentBinding.inflate(inflater)

        binding.booksRecycler.layoutManager = layoutManager
        binding.booksRecycler.adapter = bookAdapter

        val categoryId = arguments?.getString(CategoryFragment.EXTRA_CATEGORY)

        bookAdapter.submitList(BookConstant.getBookData().filter{it.categoryId == categoryId})

        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.bookGridIcon.bringToFront()
        binding.bookGridIcon.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.book_grid_icon -> {
                handleSwitchLayout()
                handleSwitchIcon()
            }
        }
    }

    private fun handleNavigateToGoogle(bookData: BookData) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Buku ${bookData.title}"))
        startActivity(intent)
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