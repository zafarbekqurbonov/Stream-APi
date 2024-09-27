package Task_29_30;


import java.util.ArrayList;
import java.util.List;

public class BookStatistics {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Kitob 1", "Muallif 1", "Fantastika", 1500));
        books.add(new Book("Kitob 2", "Muallif 2", "Fantastika", 2000));
        books.add(new Book("Kitob 3", "Muallif 3", "Dramma", 2500));
        books.add(new Book("Kitob 4", "Muallif 1", "Fantastika", 3000));
        books.add(new Book("Kitob 5", "Muallif 4", "Dramma", 3500));


        long totalBooks = books.size();
        long totalAuthors = books.stream().map(Book::getAuthor).distinct().count();
        double totalRevenue = books.stream().mapToDouble(Book::getPrice).sum();
        double averagePrice = totalRevenue / totalBooks;

        System.out.println("Umumiy hisob:");
        System.out.println("Kitoblar soni: " + totalBooks);
        System.out.println("Mualliflar soni: " + totalAuthors);
        System.out.println("Umumiy daromad: " + totalRevenue);
        System.out.println("Kitoblarning o‘rtacha narxi: " + averagePrice);
    }
}
