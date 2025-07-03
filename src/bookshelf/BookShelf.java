package bookshelf;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BookShelf<T> {
    ArrayList<T> bookshelf = new ArrayList<>();
    public void addBook(T book){
        bookshelf.add(book);
    }
    public T removeLastBook(){
        return bookshelf.remove(bookshelf.size()-1);
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "bookshelf=" + bookshelf +
                '}';
    }
}
