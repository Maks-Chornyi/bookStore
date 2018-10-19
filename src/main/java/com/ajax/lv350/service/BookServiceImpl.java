package com.ajax.lv350.service;

import com.ajax.lv350.entity.Book;
import com.ajax.lv350.repository.BookReposiroty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookReposiroty bookReposiroty;

    @Override
    public void saveBook(Book book) {
        bookReposiroty.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookReposiroty.findAll();
    }
}
