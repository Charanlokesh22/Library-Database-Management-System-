package com.library.repository;

import com.library.model.Book;
import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private static List<Book> books = new ArrayList<>();

    static {
        books.add(new Book(1, "Java Fundamentals", "James Gosling", true));
        books.add(new Book(2, "Spring Boot Basics", "Pivotal", true));
    }

    public List<Book> findAll() {
        return books;
    }

    public void save(Book book) {
        books.add(book);
    }
}
