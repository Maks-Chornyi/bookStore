package com.ajax.lv350.service;

import com.ajax.lv350.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    void saveBook(Book book);

    List<Book> getAllBooks();
}
