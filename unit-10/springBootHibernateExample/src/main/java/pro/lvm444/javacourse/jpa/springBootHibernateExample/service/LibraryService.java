package pro.lvm444.javacourse.jpa.springBootHibernateExample.service;

import pro.lvm444.javacourse.jpa.springBootHibernateExample.entity.LibraryBook;

public interface LibraryService {
    LibraryBook createBook(String isbn, String name, String author);

    LibraryBook findByISBN(String isbn);

    LibraryBook findById(Long id);
}
