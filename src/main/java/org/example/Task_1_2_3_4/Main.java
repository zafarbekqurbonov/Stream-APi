package org.example.Task_1_2_3_4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Book 1", "FICTION", true),
                new Book("Book 2", "NON-FICTION", false),
                new Book("Book 3", "FICTION", true),
                new Book("Book 4", "SCIENCE", true),
                new Book("Book 5", "FICTION", false)
        );


        List<String> titles = books.stream()
                .map(Book::getTitle)
                .collect(Collectors.toList());
        System.out.println("Titles:");
        titles.forEach(System.out::println);


        List<Book> availableBooks = books.stream()
                .filter(Book::isAvailable)
                .collect(Collectors.toList());
        System.out.println("\nAvailable Books:");
        availableBooks.forEach(book -> System.out.println(book.getTitle()));

        List<String> uniqueGenres = books.stream()
                .map(Book::getGenre)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("\nUnique Genres:");
        uniqueGenres.forEach(System.out::println);


        List<Book> fictionBooks = books.stream()
                .filter(book -> "FICTION".equalsIgnoreCase(book.getGenre()))
                .collect(Collectors.toList());
        System.out.println("\nFiction Books:");
        fictionBooks.forEach(book -> System.out.println(book.getTitle()));
    }
}