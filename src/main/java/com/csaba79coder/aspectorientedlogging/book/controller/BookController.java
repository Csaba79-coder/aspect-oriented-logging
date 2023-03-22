package com.csaba79coder.aspectorientedlogging.book.controller;

import com.csaba79coder.aspectorientedlogging.book.entity.Book;
import com.csaba79coder.aspectorientedlogging.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookController {


    private final BookService bookService;

    @RequestMapping(
            value = "/books",
            method = RequestMethod.GET,
            headers = "Accept=application/json")
    public ResponseEntity<List<Book>> renderAllBooks() {
        return ResponseEntity.status(200).body(bookService.findAllBooks());
    }

    @RequestMapping(
            value = "/books",
            method = RequestMethod.POST,
            headers = "Accept=application/json")
    public ResponseEntity<Book> addNewBook(Book book) {
        return ResponseEntity.status(201).body(bookService.addNewBook(book));
    }
}
