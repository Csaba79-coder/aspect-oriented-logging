package com.csaba79coder.aspectorientedlogging.bootstrap;

import com.csaba79coder.aspectorientedlogging.book.entity.Book;
import com.csaba79coder.aspectorientedlogging.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements ApplicationRunner {

    private final BookService bookService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Book testBook = new Book();
        testBook.setTitle("Cat among the pigeons");
        bookService.addNewBook(testBook);
    }
}
