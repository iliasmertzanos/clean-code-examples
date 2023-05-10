package Chapter6.dataabstraction.refactored;

import Chapter6.dataabstraction.Book;

public class BookService {
    public void doSomething() {

        Book newCoolBook = new Book();
        Bookstore bookstore = new Chapter6.dataabstraction.refactored.Bookstore();
        bookstore.addNewCoolBook(newCoolBook);
    }
}