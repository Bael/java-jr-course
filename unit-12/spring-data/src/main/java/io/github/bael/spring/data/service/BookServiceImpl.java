package io.github.bael.spring.data.service;

import io.github.bael.spring.data.data.BookRepository;
import io.github.bael.spring.data.entity.Book;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public List<Book> findByYear(int year) {
        return bookRepository.findByYear(year);
    }

    @Override
    public List<Book> findSame(Book book) {
        return bookRepository.findAll(Example.of(book));
    }

    @Override
    public List<Book> findByAuthor(Long authorId) {
        return bookRepository.findByAuthor(authorId);
    }

    @Override
    public List<Book> complexQuery() {
        return bookRepository.complexQueryMethod();
    }

    public Page<Book> findAtPage(int pageIndex,
                                int pageNumber,
                                Direction direction,
                                String sortField) {
        PageRequest request = PageRequest.of(pageIndex, pageNumber,
            direction, sortField);
        return bookRepository.findAll(request);
    }
}
