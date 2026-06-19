package com.library.service;

import com.library.repository.BookRepo;

public class BookService {

    private BookRepo repo;

    public void setRepo(
            BookRepo repo) {

        this.repo = repo;
    }

    public void displayService() {

        System.out.println(
            "Book Service Working"
        );

        repo.displayRepo();
    }
}