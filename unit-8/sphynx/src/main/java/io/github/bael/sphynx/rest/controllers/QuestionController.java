package io.github.bael.sphynx.rest.controllers;

import io.github.bael.sphynx.data.QuestionRepository;
import io.github.bael.sphynx.entities.Question;
import io.github.bael.sphynx.rest.dto.QuestionCreationDTO;
import io.github.bael.sphynx.rest.dto.QuestionDTO;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    private final QuestionRepository questionRepository;

    public QuestionController(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @GetMapping("/")
    public List<QuestionDTO> getQuestions() {
        return questionRepository.findAll().stream().map(QuestionDTO::of).collect(Collectors.toList());
    }

    @PostMapping("/")
    @Transactional
    public QuestionDTO createQuestion(@RequestBody QuestionCreationDTO creationDTO) {

        Question q = new Question();
        q.setName(creationDTO.getName());
        q.setDescription(creationDTO.getDescription());


        q = questionRepository.save(q);
        return QuestionDTO.of(q);

    }
}
