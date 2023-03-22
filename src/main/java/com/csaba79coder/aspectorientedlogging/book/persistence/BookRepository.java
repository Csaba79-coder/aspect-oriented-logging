package com.csaba79coder.aspectorientedlogging.book.persistence;

import com.csaba79coder.aspectorientedlogging.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
