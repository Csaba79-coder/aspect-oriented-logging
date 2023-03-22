package com.csaba79coder.aspectorientedlogging.book.service;

import com.csaba79coder.aspectorientedlogging.book.entity.Book;
import com.csaba79coder.aspectorientedlogging.book.persistence.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Book addNewBook(Book book) {
        Book entity = new Book();
        entity.setTitle(book.getTitle());
        return bookRepository.save(entity);
    }
}
