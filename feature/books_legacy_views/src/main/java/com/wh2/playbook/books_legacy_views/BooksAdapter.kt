package com.wh2.playbook.books_legacy_views

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wh2.playbook.books_legacy_views.databinding.ItemBookListBinding
import com.wh2.playbook.core.books.Book

class BooksAdapter : RecyclerView.Adapter<BooksViewHolder>() {

    private var books: List<Book> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): BooksViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_book_list, parent, false)
        val viewBinding = ItemBookListBinding.bind(view)
        return BooksViewHolder(viewBinding)
    }


    override fun onBindViewHolder(
        holder: BooksViewHolder,
        position: Int,
    ) {
        val book = books[position]
        holder.setAuthor(book.author)
        holder.setTitle(book.title)
        holder.loadCoverImage(book.coverUrl)
    }

    override fun getItemCount(): Int {
        return books.size
    }

    fun updateBooks(books: List<Book>) {
        this.books = books
    }

}