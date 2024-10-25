package org.howard.edu.lsp.midterm.question1;

public class Book {
    // Private attributes for encapsulation
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;

    // Default constructor
    public Book() {
        // Initialize with default values
        this.title = "";
        this.author = "";
        this.ISBN = "";
        this.yearPublished = 0;
    }

    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Book) {
            Book otherBook = (Book) obj;
            return this.ISBN.equals(otherBook.ISBN) && this.author.equals(otherBook.author);
        }

        return false;
    }

    @Override
    public String toString() {
        return "Book Title: " + title + "\n"
                + "Author: " + author + "\n"
                + "ISBN: " + ISBN + "\n"
                + "Year Published: " + yearPublished;
    }
}
