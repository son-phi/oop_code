public class Book {
    private String title;
    private String author;
    private String genre;
    private String ISBN;
    private double price;

    // Constructor
    public Book(String title, String author, String genre, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.ISBN = ISBN;
        this.price = price;
    }

    // Getters và Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [Title: " + title + ", Author: " + author + ", Genre: " + genre +
                ", ISBN: " + ISBN + ", Price: " + price + "]";
    }
}
