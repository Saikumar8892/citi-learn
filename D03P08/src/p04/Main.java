package p04;

import java.util.*;

class Book implements Comparable<Book> {
    private int bookId;
    private String title;
    private double price;
    private Date publicationDate;
    private String author;

    public Book(int bookId, String title, double price, Date publicationDate, String author) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.publicationDate = publicationDate;
        this.author = author;
    }

    @Override
    public String toString() {
        return bookId + " " + title + "\n" + publicationDate + "\n" + price + " " + author;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, title, price, publicationDate, author);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return bookId == book.bookId &&
                Double.compare(book.price, price) == 0 &&
                Objects.equals(title, book.title) &&
                Objects.equals(publicationDate, book.publicationDate) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int compareTo(Book other) {
        return this.author.compareTo(other.author);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create TreeSet to store Book details
        TreeSet<Book> books = new TreeSet<>();

        // Predefined information of 5 Book details
        books.add(new Book(1001, "Python Learning", 715.0, new Date(84, 2, 6), "Martic C. Brown"));
        books.add(new Book(1002, "Modern Mainframe", 295.0, new Date(97, 4, 19), "Sharad"));
        books.add(new Book(1003, "Java Programming", 523.0, new Date(84, 10, 23), "Gilad Bracha"));
        books.add(new Book(1004, "Read C++", 295.0, new Date(84, 10, 19), "Henry Harvin"));
        books.add(new Book(1005, ".Net Platform", 3497.0, new Date(84, 2, 19), "MarkJ. Price"));

        // Print all the Book details sorted by author names
        for (Book book : books) {
            System.out.println(book);
            System.out.println();
        }
    }
}