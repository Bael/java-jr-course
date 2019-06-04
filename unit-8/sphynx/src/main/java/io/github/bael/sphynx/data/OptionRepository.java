package io.github.bael.sphynx.data;

import io.github.bael.sphynx.entities.Option;
import io.github.bael.sphynx.entities.Question;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface OptionRepository extends CrudRepository<Option, Long> {

    List<Option> findAllByQuestion(Question q);
}
