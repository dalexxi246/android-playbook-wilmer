package com.wh2.playbook.core.books

interface BooksRepository {

    suspend fun getAllBooks(): List<Book>

}