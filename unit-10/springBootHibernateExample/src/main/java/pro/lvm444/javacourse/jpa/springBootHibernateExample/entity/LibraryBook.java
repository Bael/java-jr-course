package pro.lvm444.javacourse.jpa.springBootHibernateExample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LibraryBook {

    public String getAuthor() {
        return author;
    }

    private String author;

    public String getName() {
        return name;
    }

    private String name;

    public String getIsbn() {
        return isbn;
    }

    private String isbn;

    public Long getId() {
        return id;
    }

    @GeneratedValue
    @Id Long id;

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("id %d isbn %s name %s author %s", id,isbn, name, author);
    }
}
