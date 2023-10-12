package com.example.bookz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bookz.category.CategoryAdapter
import com.example.bookz.category.CategoryConstant
import com.example.bookz.category.CategoryData
import com.example.bookz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener {
    companion object {
        const val EXTRA_CATEGORY = "extra_category"
    }

    private lateinit var binding: ActivityMainBinding
    private var layoutManager: GridLayoutManager = GridLayoutManager(this, 1)
    private var categoryAdapter = CategoryAdapter(layoutManager) { categoryData: CategoryData ->
        handleNavigateToBookList(categoryData)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.categoryRecycler.layoutManager = layoutManager
        binding.categoryRecycler.adapter = categoryAdapter

        categoryAdapter.submitList(CategoryConstant.getCategoryData())

        binding.mainGridIcon.bringToFront()
        binding.mainGridIcon.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.main_grid_icon -> {
                handleSwitchLayout()
                handleSwitchIcon()
            }
        }
    }

    private fun handleNavigateToBookList(categoryData: CategoryData) {
        val intent = Intent(this, BookListActivity::class.java)
        intent.putExtra(EXTRA_CATEGORY, categoryData)
        startActivity(intent)
    }

    private fun handleSwitchLayout() {
        if (layoutManager.spanCount == 1) {
            layoutManager.spanCount = 2
        } else {
            layoutManager.spanCount = 1
        }
        categoryAdapter.notifyItemRangeChanged(0, categoryAdapter?.itemCount ?: 0)
    }

    private fun handleSwitchIcon() {
        if (layoutManager.spanCount == 1) {
            binding.mainGridIcon.setImageResource(R.drawable.ic_grid)
        } else {
            binding.mainGridIcon.setImageResource(R.drawable.ic_grid_off)
        }
    }
}