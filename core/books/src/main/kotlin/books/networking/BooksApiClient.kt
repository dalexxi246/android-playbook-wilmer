package books.networking

import retrofit2.Converter
import retrofit2.Retrofit

class BooksApiClient(
    baseUrl: String = "https://openlibrary.org/",
    converterFactory: Converter.Factory,
) {

    val retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(converterFactory)
        .build()

}