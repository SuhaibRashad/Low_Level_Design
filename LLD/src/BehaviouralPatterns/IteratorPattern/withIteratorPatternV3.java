package BehaviouralPatterns.IteratorPattern;
import com.sun.source.tree.Tree;

import java.util.*;

class BookV3 implements Comparable<BookV3>{
    private String title;

    public BookV3(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }


    @Override
    public int compareTo(BookV3 o) {
        return this.title.compareTo(o.title);
    }

}




class BookCollectionV3 implements Iterable<BookV3>{
    private Set<BookV3> books = new TreeSet<>();

    public void addBook(BookV3 book){
        books.add(book);
    }

    @Override
    public Iterator<BookV3> iterator() {
        return books.iterator();
    }
}
public class withIteratorPatternV3 {
    public static void main(String[] args) {
        BookCollectionV3 bookCollection = new BookCollectionV3();
        bookCollection.addBook(new BookV3("Python Book"));
        bookCollection.addBook(new BookV3("C++ Book"));
        bookCollection.addBook(new BookV3("Java Book"));


        Iterator<BookV3> iterator = bookCollection.iterator(); //Standardized

        while(iterator.hasNext()){
            BookV3 book = iterator.next();
            System.out.println(book);
        }
    }
}
