package Task_5_6_7;

class Book {
    private String title;
    private String genre;
    private boolean isAvailable;
    private double price;
    private String author;
    private int yearPublished;

    // Constructor, getters, and setters

    public Book(String title, String genre, boolean isAvailable, double price, String author, int yearPublished) {
        this.title = title;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.price = price;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }
}