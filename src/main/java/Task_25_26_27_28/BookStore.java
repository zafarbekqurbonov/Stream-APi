package Task_25_26_27_28;

import java.util.*;
import java.util.stream.Collectors;

public class BookStore {
    public static void main(String[] args) {

        Author author1 = new Author("Author One", 90);
        Author author2 = new Author("Author Two", 80);
        Author author3 = new Author("Author Three", 85);

        List<Book> books = Arrays.asList(
                new Book("Book A", "Fiction", 2016, 55.99, author1),
                new Book("Book B", "Non-Fiction", 2018, 45.99, author2),
                new Book("Book C", "Fiction", 2015, 60.99, author3),
                new Book("Book D", "Fiction", 2020, 75.99, author1),
                new Book("Book E", "Non-Fiction", 2019, 30.99, author2)
        );


        List<Book> expensiveBooks = books.stream()
                .filter(book -> book.getPrice() > 50)
                .sorted(Comparator.comparing(Book::getPrice).reversed())
                .collect(Collectors.toList());
        System.out.println("Books with Price Over $50: " + expensiveBooks.stream().map(Book::getTitle).collect(Collectors.toList()));


        Optional<Book> mostExpensiveBook = books.stream()
                .max(Comparator.comparing(Book::getPrice));
        mostExpensiveBook.ifPresent(book -> System.out.println("Most Expensive Book: " + book.getTitle() + " - Price: $" + book.getPrice()));

        List<Map<String, Integer>> booksWithWordCount = books.stream()
                .map(book -> {
                    Map<String, Integer> bookInfo = new HashMap<>();
                    bookInfo.put(book.getTitle(), book.getTitle().split(" ").length);
                    return bookInfo;
                })
                .collect(Collectors.toList());
        System.out.println("Books with Word Count in Titles: " + booksWithWordCount);


        List<Customer> customers = Arrays.asList(
                new Customer("Customer A", 25),
                new Customer("Customer B", 35),
                new Customer("Customer C", 60),
                new Customer("Customer D", 45),
                new Customer("Customer E", 70)
        );

        Map<String, List<Customer>> customersByAgeGroup = customers.stream()
                .collect(Collectors.groupingBy(customer -> {
                    if (customer.getAge() < 30) return "Under 30";
                    else if (customer.getAge() < 50) return "30-49";
                    else return "50 and over";
                }));
        System.out.println("Customers by Age Group: " + customersByAgeGroup);
    }
}