package com.example.bookz2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.bookz2.category.CategoryAdapter
import com.example.bookz2.category.CategoryConstant
import com.example.bookz2.category.CategoryData
import com.example.bookz2.databinding.CategoryFragmentBinding

class CategoryFragment: Fragment(), OnClickListener {
    companion object {
        const val EXTRA_CATEGORY = "category"
    }

    private lateinit var binding: CategoryFragmentBinding
    private var layoutManager: GridLayoutManager = GridLayoutManager(view?.context, 1)
    private var categoryAdapter = CategoryAdapter(layoutManager) { categoryData: CategoryData ->
        handleNavigateToBook(categoryData)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = CategoryFragmentBinding.inflate(inflater)

        binding.categoryRecycler.layoutManager = layoutManager
        binding.categoryRecycler.adapter = categoryAdapter

        categoryAdapter.submitList(CategoryConstant.getCategoryData())

        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

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

    private fun handleNavigateToBook(categoryData: CategoryData) {
        val bundle = Bundle()
        bundle.putString(EXTRA_CATEGORY, categoryData.id)
        view?.findNavController()?.navigate(R.id.action_categoryFragment_to_bookFragment2, bundle)
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