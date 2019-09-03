package io.github.bael.spring.data.service;

import io.github.bael.spring.data.SpringDataApplication;
import io.github.bael.spring.data.data.BookRepository;
import io.github.bael.spring.data.entity.Book;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringDataApplication.class)
public class BookServiceImplTest {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookService bookService;

    @Before
    public void init() {
        Book book = new Book();
        book.setDescription("Увлекательные приключения Тома Сойера");
        book.setTitle("Приключения Тома Сойера");
        book.setYear(1876);
        bookRepository.save(book);

        Book book2 = new Book();
        book2.setTitle("Михаил Строгов");
        book2.setYear(1876);
        bookRepository.save(book2);
    }

    @Test
    public void testSave() {
        boolean founded = false;

        for (Book iteratedBook : bookRepository.findAll()) {
            if (iteratedBook.getTitle().equals("Приключения Тома Сойера")
                    && iteratedBook.getId() > 0) {
                founded = true;
            }
        }
        Assert.assertTrue(founded);
    }

    @Test
    public void testFindByYear() {
        Assert.assertTrue(
        bookRepository.findByYear(1876)
                      .stream()
                      .anyMatch(
                        book ->
                           book.getYear() == 1876));
    }

    @Test
    public void testFindByBook() {

        Book book = new Book();
        book.setYear(1876);

        Assert.assertEquals(2, bookService.findSame(book).size());

    }


}