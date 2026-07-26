package com.library.controller;

import com.library.entity.Book;
import com.library.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import javax.annotation.processing.Generated;

@RestController

@RequestMapping("/books")

public class BookController {

    @Autowired
    private BookRepository repository;

    @GetMapping("/allBooks")
    public List<Book> getBooks() {

        return repository.findAll();
    }

    @PostMapping("/addBook")
    public Book addBook(
            @RequestBody Book book) {

        return repository.save(book);
    }
    @PutMapping("/updateBook/{id}")
    public Book updateBook(
            @PathVariable int id,
            @RequestBody Book book) {

        book.setId(id);
        return repository.save(book);
    }
}