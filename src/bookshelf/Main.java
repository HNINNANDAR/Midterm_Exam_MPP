package bookshelf;

import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {
        BookShelf<String> bookShelf = new BookShelf<>();
        bookShelf.addBook("Java");
        bookShelf.addBook("C");
        bookShelf.removeLastBook();
        System.out.println(bookShelf.toString());
    }
}
