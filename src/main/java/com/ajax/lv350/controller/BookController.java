package com.ajax.lv350.controller;

import com.ajax.lv350.entity.Book;
import com.ajax.lv350.response.ServiceResponse;
import com.ajax.lv350.service.BookService;
import com.ajax.lv350.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/getAllBooks")
    public ResponseEntity<Object> getAllBooks() {
        List<Book> list = bookService.getAllBooks();
        ServiceResponse<List<Book>> response = new ServiceResponse<>("success",list);
        return new ResponseEntity<Object>(response,HttpStatus.OK);
    }

    @PostMapping("/saveBook")
    public ResponseEntity<Object> saveBook(@RequestBody Book book) {
        bookService.saveBook(book);
        ServiceResponse<Book> response = new ServiceResponse<>("success",book);
        return new ResponseEntity<Object>(response,HttpStatus.CREATED);
    }
}
