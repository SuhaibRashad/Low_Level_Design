package BehaviouralPatterns.IteratorPattern;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class BookV2{
    private String title;

    public BookV2(String title) {
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

}

class BookCollectionV2 {
    private List<BookV2> books = new ArrayList<>();

    public void addBook(BookV2 book){
        books.add(book);
    }

    public List<BookV2> getBooks(){
        return books;
    }

    public Iterator<BookV2> createIterator(){
        return new BookIterator(this.books);
    }

    //Another Class (Nested Class)
    private class BookIterator implements Iterator<BookV2>{
        private List<BookV2> books;
        private int position = 0;

        public BookIterator(List<BookV2> books){
            this.books = books;
        }

        @Override
        public boolean hasNext() {
            return position < books.size();
        }

        @Override
        public BookV2 next() {
            return books.get(position++);
        }
    }
}
public class withIteratorPatternV2 {
    public static void main(String[] args) {
        BookCollectionV2 bookCollection = new BookCollectionV2();
        bookCollection.addBook(new BookV2("C++ Book"));
        bookCollection.addBook(new BookV2("Java Book"));
        bookCollection.addBook(new BookV2("Python Book"));

        Iterator<BookV2> iterator = bookCollection.createIterator();
        while(iterator.hasNext()){
            BookV2 book = iterator.next();
            System.out.println(book);
        }
    }
}
