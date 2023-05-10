package Chapter6.dataabstraction.original;

import Chapter6.dataabstraction.Book;

import java.util.List;

public class Bookstore {

    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}

