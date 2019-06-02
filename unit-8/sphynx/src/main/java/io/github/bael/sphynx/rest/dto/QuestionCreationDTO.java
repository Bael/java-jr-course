package io.github.bael.sphynx.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionCreationDTO {

    private String name;
    private String description;

}

