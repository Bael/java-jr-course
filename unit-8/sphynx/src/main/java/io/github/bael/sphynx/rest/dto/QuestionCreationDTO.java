package io.github.bael.sphynx.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionCreationDTO {

    private String name;
    private String description;

    @JsonProperty("options")
    private List<OptionDTO> options;
}

