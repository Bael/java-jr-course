package io.github.bael.sphynx.rest.controllers;

import io.github.bael.sphynx.data.OptionRepository;
import io.github.bael.sphynx.data.QuestionRepository;
import io.github.bael.sphynx.entities.Option;
import io.github.bael.sphynx.entities.Question;
import io.github.bael.sphynx.rest.dto.OptionDTO;
import io.github.bael.sphynx.rest.dto.QuestionCreationDTO;
import io.github.bael.sphynx.rest.dto.QuestionDTO;
import java.util.List;
import java.util.stream.Collectors;
import javax.transaction.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    private final QuestionRepository questionRepository;
    private final OptionRepository optionRepository;

    public QuestionController(QuestionRepository questionRepository,
        OptionRepository optionRepository) {
        this.questionRepository = questionRepository;
        this.optionRepository = optionRepository;
    }

    @GetMapping("/")
    public List<QuestionDTO> getQuestions() {
        return questionRepository.findAll()
                                 .stream()
                                 .map(question -> QuestionDTO.of(question, optionRepository.findAllByQuestion(question)))
                                 .collect(Collectors.toList());
    }


    @PostMapping("/")
    @Transactional
    public QuestionDTO createQuestion(@RequestBody QuestionCreationDTO creationDTO) {

        Question q = new Question();
        q.setName(creationDTO.getName());
        q.setDescription(creationDTO.getDescription());
        q = questionRepository.save(q);

        for (OptionDTO optionDTO : creationDTO.getOptions()) {
            Option o = new Option();
            o.setName(optionDTO.getName());
            o.setValid(optionDTO.isValid());
            o.setQuestion(q);
            optionRepository.save(o);

        }
        return QuestionDTO.of(q, optionRepository.findAllByQuestion(q));
    }
}
