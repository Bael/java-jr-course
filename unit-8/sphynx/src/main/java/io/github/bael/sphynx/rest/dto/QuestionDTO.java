package io.github.bael.sphynx.rest.dto;

import io.github.bael.sphynx.entities.Question;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionDTO {
    private Long id;
    private String name;
    private String description;

    public static QuestionDTO of(Question question) {
        return builder().description(question.getDescription())
                .id(question.getId())
                .name(question.getName())
                .build();
    }

}
