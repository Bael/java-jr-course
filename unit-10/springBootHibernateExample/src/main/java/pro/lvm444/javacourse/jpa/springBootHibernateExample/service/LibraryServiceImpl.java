package pro.lvm444.javacourse.jpa.springBootHibernateExample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.lvm444.javacourse.jpa.springBootHibernateExample.entity.LibraryBook;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class LibraryServiceImpl implements LibraryService {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public LibraryBook createBook(String isbn, String name, String author)
    {
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        LibraryBook book = new LibraryBook();
        book.setIsbn(isbn);
        book.setName(name);
        book.setAuthor(author);

        entityManager.persist(book);

        return book;
    }

    @Override
    public LibraryBook findByISBN(String isbn) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        TypedQuery<LibraryBook> query = entityManager.createQuery("SELECT b FROM LibraryBook as b WHERE b.isbn=:isbn", LibraryBook.class);
        query.setParameter("isbn",isbn);

        List<LibraryBook> resultList = query.getResultList();

        if (resultList.size()>0)
        {
            return resultList.get(0);
        }
        else {
            return null;
        }
    }

    @Override
    public LibraryBook findById(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        LibraryBook book = entityManager.find(LibraryBook.class, id);

        return book;

    }
}
