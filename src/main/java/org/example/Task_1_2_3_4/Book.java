package org.example.Task_1_2_3_4;

class Book {
    private String title;
    private String genre;
    private boolean isAvailable;


    public Book(String title, String genre, boolean isAvailable) {
        this.title = title;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}