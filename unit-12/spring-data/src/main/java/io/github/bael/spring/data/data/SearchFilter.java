package io.github.bael.spring.data.data;

import lombok.Data;

@Data
public class SearchFilter {
    private Integer startYear;
    private Integer finishYear;
    private String title;

}
