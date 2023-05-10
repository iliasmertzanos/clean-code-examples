package Chapter6.dataabstraction.simple;

import Chapter6.dataabstraction.Book;

import java.util.List;
import java.util.Optional;

public class BookService {

    public void doSomething() {
        Book newCoolBook = new Book();
        Bookstore bookstore = new Bookstore();
        List<Book> books = bookstore.getBooks();
        Optional<Book> coolBook = books.stream().filter(Book::isCool).findFirst();
        if (coolBook.isEmpty()) {
            books.add(newCoolBook);
            bookstore.setBooks(books);
        }
    }
}