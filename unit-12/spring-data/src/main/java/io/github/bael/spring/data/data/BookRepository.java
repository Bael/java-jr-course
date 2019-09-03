package io.github.bael.spring.data.data;

import io.github.bael.spring.data.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository
        extends CrudRepository<Book, Long>, JpaRepository<Book, Long> {


    List<Book> findByYear(int year);


}
