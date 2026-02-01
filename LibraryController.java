package com.library.controller;

import com.library.model.Book;
import com.library.service.LibraryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class LibraryController {

    private LibraryService service = new LibraryService();

    @GetMapping
    public List<Book> getBooks() {
        return service.getAllBooks();
    }

    @PostMapping
    public String addBook(@RequestBody Book book) {
        service.addBook(book);
        return "Book added successfully";
    }
}
