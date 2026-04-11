package com.wh2.playbook.books_legacy_views

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.wh2.playbook.books_legacy_views.databinding.ItemBookListBinding

class BooksViewHolder(
    private val viewBinding: ItemBookListBinding,
    private val context: Context = viewBinding.root.context,
) : RecyclerView.ViewHolder(viewBinding.root) {

    fun setTitle(title: String) {
        viewBinding.textBookItemTitle.text = title
    }

    fun setAuthor(author: String) {
        viewBinding.textBookItemAuthor.text = author
    }

    fun loadCoverImage(coverUrl: String) {
        Glide.with(context)
            .load(coverUrl)
            .into(viewBinding.imageBookItemCover)
    }

}