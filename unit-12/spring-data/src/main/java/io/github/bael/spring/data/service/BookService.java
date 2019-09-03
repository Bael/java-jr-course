package io.github.bael.spring.data.service;

import io.github.bael.spring.data.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    void save(Book book);

    Optional<Book> findById(Long id);

    List<Book> findByYear(int year);

    List<Book> findSame(Book book);
}
