package encapsulation.library_Management;

public class Book {
    private String isbn;
    private String title;;
    private String author;
    private boolean isAvailable;

    //constructor
    public Book(String isbn, String title, String author)
    {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    public String getTitle() {
        return title;
    }
    public boolean isAvailable() {
        return isAvailable;
    }

    public String toString()
    {
        return " title: "+ title + " author:  " + author +  " ISBN number-> "+ isbn + " availability: " + isAvailable;
    }

    public void borrowBook() throws IllegalstateException {
        if(isAvailable)
            isAvailable = false;
        else throw new IllegalstateException("book is not available");
    }


}
