package encapsulation.library_Management;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books = new ArrayList<Book>();

    public void addBook(String isbn, String title, String author)
    {
        books.add( new Book(isbn,title,author));
    }
    public List<Book> getAvailableBooks()
    {
        return books.stream()
                .filter(Book::isAvailable)
                .collect(Collectors.toList());
    }

}
//Library library = new Library();
     //   library.addBook("002815668", "Myworld","Giridhara");
     //   library.getAvailableBooks().forEach(System.out::println);
