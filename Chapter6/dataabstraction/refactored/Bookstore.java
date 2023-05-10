package Chapter6.dataabstraction.refactored;

import Chapter6.dataabstraction.Book;

import java.util.List;
import java.util.Optional;

public class Bookstore {

    private List<Book> books;

    public void setBooks(Book book) {
        books.add(book);
    }

    private Optional<Book> findFirstCoolBook() {
        return books.stream().filter(Book::isCool).findFirst();
    }

    public void addNewCoolBook(Book newCoolBook) {
        Optional<Book> coolBook = books.stream().filter(Book::isCool).findFirst();
        if (coolBook.isEmpty()) {
            books.add(newCoolBook);
        }
    }
}

