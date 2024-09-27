package Task_29_30;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

class Book {
    private String title;
    private String author;
    private String genre;
    private double price;

    public Book(String title, String author, String genre, double price) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}

