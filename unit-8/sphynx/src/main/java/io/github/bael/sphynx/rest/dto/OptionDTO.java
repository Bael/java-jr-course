package io.github.bael.sphynx.rest.dto;

import io.github.bael.sphynx.entities.Option;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class OptionDTO {
    private String name;
    private boolean isValid;

    public static OptionDTO of(Option o) {
        return OptionDTO.builder().isValid(o.isValid()).name(o.getName()).build();
    }
}
