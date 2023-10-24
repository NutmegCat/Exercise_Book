// Aaron Prince Anu

public class Book {
    private String title;
    private String author;

    public Book (String author, String title) {
        this.title = title;
        this.author = author;
    }

    public String toString () {
        return "Title: " + title + " Author: " + author;
    }
}