package Task_19_20_21_22_23_24;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookStore {
    public static void main(String[] args) {

        Author author1 = new Author("Author One", 90);
        Author author2 = new Author("Author Two", 80);
        Author author3 = new Author("Author Three", 85);

        List<Book> books = Arrays.asList(
                new Book("Book A", "Fiction", 2016, 10.99, author1),
                new Book("Book B", "Non-Fiction", 2018, 15.99, author2),
                new Book("Book C", "Fiction", 2015, 12.99, author3),
                new Book("Book D", "Fiction", 2020, 9.99, author1),
                new Book("Book E", "Non-Fiction", 2019, 14.99, author2)
        );


        Map<String, List<Book>> booksByGenre = books.stream()
                .collect(Collectors.groupingBy(Book::getGenre));
        System.out.println("Books by Genre: " + booksByGenre);


        List<Book> sortedBooks = books.stream()
                .sorted(Comparator.comparing(Book::getPublicationYear)
                        .thenComparing(Book::getPrice))
                .collect(Collectors.toList());
        System.out.println("Sorted Books: " + sortedBooks);


        List<Author> topAuthors = Arrays.asList(author1, author2, author3).stream()
                .sorted(Comparator.comparing(Author::getPopularity).reversed())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Top 3 Authors: " + topAuthors);


        int totalBooksOrdered = books.size();
        System.out.println("Total Books Ordered: " + totalBooksOrdered);


        Map<String, Long> genreCount = books.stream()
                .collect(Collectors.groupingBy(Book::getGenre, Collectors.counting()));
        String mostCommonGenre = genreCount.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
        System.out.println("Most Common Genre: " + mostCommonGenre);


        List<Author> authorsAfter2015 = Arrays.asList(author1, author2, author3).stream()
                .filter(author -> books.stream()
                        .anyMatch(book -> book.getAuthor().equals(author) && book.getPublicationYear() > 2015))
                .collect(Collectors.toList());
        System.out.println("Authors with Books After 2015: " + authorsAfter2015);
    }
}
