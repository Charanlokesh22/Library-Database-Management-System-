package com.library.service;

import com.library.model.Book;
import com.library.repository.BookRepository;
import java.util.List;

public class LibraryService {

    private BookRepository repository = new BookRepository();

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public void addBook(Book book) {
        repository.save(book);
    }
}
