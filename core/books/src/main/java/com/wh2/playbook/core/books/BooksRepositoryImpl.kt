package com.wh2.playbook.core.books

class BooksRepositoryImpl : BooksRepository {

    private val cachedBooks: List<Book> = listOf(
        Book(
            id = 1L,
            title = "The Great Gatsby",
            author = "F. Scott Fitzgerald",
            coverUrl = "https://covers.openlibrary.org/a/olid/OL23919A-M.jpg"
        ),
        Book(
            id = 2L,
            title = "To Kill a Mockingbird",
            author = "Harper Lee",
            coverUrl = "https://covers.openlibrary.org/a/olid/OL23919A-M.jpg"
        ),
        Book(
            id = 3L,
            title = "1984",
            author = "George Orwell",
            coverUrl = "https://covers.openlibrary.org/a/olid/OL23919A-M.jpg"
        ),
    )

    override suspend fun getAllBooks(): List<Book> {
        return cachedBooks
    }
}