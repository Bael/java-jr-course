package io.github.bael.sphynx.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.bael.sphynx.entities.Option;
import io.github.bael.sphynx.entities.Question;
import java.util.List;
import java.util.stream.Collectors;
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
    @JsonProperty("options")
    private List<OptionDTO> options;

    public static QuestionDTO of(Question question, List<Option> optionsList) {
        return builder().description(question.getDescription())
                        .id(question.getId())
                        .name(question.getName())
                        .options(optionsList.stream().map(OptionDTO::of).collect(Collectors.toList()))
                        .build();
    }

}
