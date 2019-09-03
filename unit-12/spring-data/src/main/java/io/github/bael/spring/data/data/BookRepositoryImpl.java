package io.github.bael.spring.data.data;

import io.github.bael.spring.data.entity.Book;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryImpl implements BookComplexQueryRepository {

    private final JdbcTemplate jdbcTemplate;

    public BookRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Book> complexQueryMethod() {
        return jdbcTemplate.query("select id, title, description, year from book", (rs, rowNum) ->
            book(rs.getLong("id"),
                rs.getString("title"),
                rs.getString("description"),
                rs.getInt("year"))
        );
    }

    private Book book(long id, String title, String description, int year) {
        Book book = new Book();
        book.setDescription(description);
        book.setId(id);
        book.setTitle(title);
        book.setYear(year);
        return book;
    }
}
