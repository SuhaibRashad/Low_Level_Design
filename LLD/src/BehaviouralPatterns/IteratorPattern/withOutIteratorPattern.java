package BehaviouralPatterns.IteratorPattern;


import java.util.ArrayList;
import java.util.List;

class Book{
    private String title;

    public Book(String title) {
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


class BookCollectionV1 {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getBooks(){
        return books;
    }
}

public class withOutIteratorPattern {
    public static void main(String[] args) {
        BookCollectionV1 bookCollection = new BookCollectionV1();
        bookCollection.addBook(new Book("C++ Book"));
        bookCollection.addBook(new Book("Java Book"));
        bookCollection.addBook(new Book("Python Book"));

        for(int i=0;i<bookCollection.getBooks().size();i++){
            System.out.println(bookCollection.getBooks().get(i));
        }
    }
}
