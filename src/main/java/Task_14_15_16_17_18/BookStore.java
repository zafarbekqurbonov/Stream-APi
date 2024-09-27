package Task_14_15_16_17_18;

import java.util.*;
import java.util.stream.Collectors;

class Book {
    private String title;
    private double price;


    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}

class Customer {
    private String name;
    private List<Book> purchasedBooks;

    public Customer(String name, List<Book> purchasedBooks) {
        this.name = name;
        this.purchasedBooks = purchasedBooks;
    }

    public List<Book> getPurchasedBooks() {
        return purchasedBooks;
    }
}

public class BookStore {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer("Alice", Arrays.asList(new Book("Java Programming", 29.99), new Book("Clean Code", 29.99))),
                new Customer("Bob", Arrays.asList(new Book("Effective Java", 35.50))),
                new Customer("Charlie", Arrays.asList(new Book("Java Programming", 29.99), new Book("Head First Java", 39.99)))
        );

        List<Book> allPurchasedBooks = customers.stream()
                .flatMap(customer -> customer.getPurchasedBooks().stream())
                .collect(Collectors.toList());

        allPurchasedBooks.forEach(book -> System.out.println(book.getTitle()));
    }
}
