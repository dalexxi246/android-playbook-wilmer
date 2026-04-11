package com.wh2.playbook.books_legacy_views

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.wh2.playbook.books_legacy_views.databinding.ActivityBooksViewsBinding
import com.wh2.playbook.core.books.BooksViewModel
import kotlinx.coroutines.launch

class BooksViewsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBooksViewsBinding

    private val viewModel: BooksViewModel by viewModels { BooksViewModel.Factory }

    private val adapter = BooksAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityBooksViewsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setupWindowInsets()
        setupRecyclerView()
        observeBooks()
    }

    private fun setupRecyclerView() {
        binding.recyclerViewBooksList.layoutManager = LinearLayoutManager(this)
        binding.recyclerViewBooksList.adapter = adapter
    }

    private fun setupWindowInsets() {
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.container_books_list)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )
            insets
        }
    }

    private fun observeBooks() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.books.collect { books ->
                    adapter.updateBooks(books)
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        viewModel.loadBooks()
    }

    companion object {
        fun getCallingIntent(context: Context): Intent {
            return Intent(context, BooksViewsActivity::class.java)
        }
    }
}