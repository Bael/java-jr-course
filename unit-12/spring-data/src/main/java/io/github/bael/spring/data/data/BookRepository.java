package io.github.bael.spring.data.data;

import io.github.bael.spring.data.entity.Book;
import java.util.List;
import javax.persistence.NamedNativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BookRepository
    extends CrudRepository<Book, Long>,
    PagingAndSortingRepository<Book, Long>,
    JpaRepository<Book, Long>,
    BookComplexQueryRepository {
    List<Book> findByYear(int year);

    @Query("select aob.book from "
        + "AuthorOfBook aob join aob.book "
        + "join aob.author "
        + "where  aob.author.id = ?1")
    List<Book> findByAuthor(Long authorId);

}
