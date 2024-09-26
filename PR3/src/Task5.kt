/*
5. Класс "Книга" и "Библиотека"
Создайте класс Book с полями title, author, и year.
Создайте класс Library, который содержит коллекцию книг и методы для добавления книг,
поиска по автору и году публикации.
 */

class Book (val title: String, val author: String, val year: Int)

class Library() {
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun searchByAuthor(author: String): List<Book> {
        val result = mutableListOf<Book>()
        for (book in books) {
            if (book.author == author) {
                result.add(book)
            }
        }
        return result
    }

    fun searchByYear(year: Int): List<Book> {
        val result = mutableListOf<Book>()
        for (book in books) {
            if (book.year == year) {
                result.add(book)
            }
        }
        return result
    }
}