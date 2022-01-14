package ndBookStore.model;


import lombok.AllArgsConstructor;
import lombok.Data;



public class Book {

    private long id; // unikalus numeris
    private String title;
    private String Author;
    private double price;
    private BookGenre genre;

    public Book(long id, String title, String author, double price, BookGenre genre) {
        this.id = id;
        this.title = title;
        Author = author;
        this.price = price;
        this.genre = genre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BookGenre getGenre() {
        return genre;
    }

    public void setGenre(BookGenre genre) {
        this.genre = genre;
    }
}
