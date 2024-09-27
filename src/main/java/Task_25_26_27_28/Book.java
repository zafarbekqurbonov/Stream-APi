package Task_25_26_27_28;
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

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getPublicationYear() {
        return publicationYear;
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
}

class Customer {
    private String name;
    private int age;

    // Constructor, Getters and Setters
    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}



