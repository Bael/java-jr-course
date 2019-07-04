package pro.lvm444.javacourse.jpa.springBootHibernateExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pro.lvm444.javacourse.jpa.springBootHibernateExample.entity.LibraryBook;
import pro.lvm444.javacourse.jpa.springBootHibernateExample.service.LibraryService;

@SpringBootApplication
public class SpringBootHibernateExampleApplication implements CommandLineRunner {

	@Autowired
	private LibraryService libraryService;

	static Logger log = LoggerFactory.getLogger(SpringBootHibernateExampleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateExampleApplication.class, args);

		log.info("INIT COMPLETE");
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("CREATE BOOK");

		LibraryBook mother = libraryService.createBook("IS-001", "Мать", "Достоевский");
		LibraryBook dead = libraryService.createBook("IS-002", "Мертвые души", "Гоголь");

		log.info(mother.toString());
		log.info(dead.toString());

		log.info("FIND BOOK");
		LibraryBook finded1 = libraryService.findByISBN("IS-001");
		LibraryBook finded2 = libraryService.findById(dead.getId());

		log.info("Найдены книги: ");
		log.info(String.valueOf(finded1));
		log.info(String.valueOf(finded2));
	}
}
