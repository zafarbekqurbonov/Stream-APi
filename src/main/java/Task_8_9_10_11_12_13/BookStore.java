package Task_8_9_10_11_12_13;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookStore {
    private List<Book> books;



    public List<Book> getBooksByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    public Book getMostExpensiveBook() {
        return books.stream()
                .max(Comparator.comparing(Book::getPrice))
                .orElse(null);
    }

    public double getAveragePrice() {
        return books.stream()
                .mapToDouble(Book::getPrice)
                .average()
                .orElse(0.0);
    }

    public long getTotalBooks() {
        return books.stream().count();
    }

    public List<Book> getCheapestBooks(int limit) {
        return books.stream()
                .sorted(Comparator.comparing(Book::getPrice))
                .limit(limit)
                .collect(Collectors.toList());
    }

    public boolean isAnyBookOutOfStock() {
        return books.stream()
                .anyMatch(book -> !book.isInStock());
    }
}
