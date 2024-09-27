package Task_5_6_7;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Book 1", "FICTION", true, 15.99, "Author A", 1998),
                new Book("Book 2", "NON-FICTION", false, 12.50, "Author B", 2001),
                new Book("Book 3", "FICTION", true, 22.00, "Author A", 2005),
                new Book("Book 4", "SCIENCE", true, 9.99, "Author C", 2010),
                new Book("Book 5", "FICTION", false, 17.50, "Author D", 1995)
        );


        List<Book> sortedByPrice = books.stream()
                .sorted(Comparator.comparingDouble(Book::getPrice))
                .collect(Collectors.toList());
        System.out.println("Sorted Books by Price:");
        sortedByPrice.forEach(book -> System.out.println(book.getTitle() + ": " + book.getPrice()));


        List<String> uniqueAuthors = books.stream()
                .map(Book::getAuthor)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("\nUnique Authors:");
        uniqueAuthors.forEach(System.out::println);

        List<Book> booksAfter2000 = books.stream()
                .filter(book -> book.getYearPublished() > 2000)
                .collect(Collectors.toList());
        System.out.println("\nBooks Published After 2000:");
        booksAfter2000.forEach(book -> System.out.println(book.getTitle() + " (" + book.getYearPublished() + ")"));
    }
}