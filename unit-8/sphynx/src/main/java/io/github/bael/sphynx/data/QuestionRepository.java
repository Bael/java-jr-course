package io.github.bael.sphynx.data;

import io.github.bael.sphynx.entities.Question;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuestionRepository extends CrudRepository<Question, Long> {

    List<Question> findAll();
}
