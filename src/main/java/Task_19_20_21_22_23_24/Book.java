package Task_19_20_21_22_23_24;

import java.util.*;
import java.util.stream.Collectors;

class Book {
    private String title;
    private String genre;
    private int publicationYear;
    private double price;
    private Author author;


    public Book(String title, String genre, int publicationYear, double price, Author author) {
        this.title = title;
        this.genre = genre;
        this.publicationYear = publicationYear;
        this.price = price;
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public double getPrice() {
        return price;
    }

    public Author getAuthor() {
        return author;
    }
}

class Author {
    private String name;
    private int popularity;


    public Author(String name, int popularity) {
        this.name = name;
        this.popularity = popularity;
    }

    public String getName() {
        return name;
    }

    public int getPopularity() {
        return popularity;
    }
}



