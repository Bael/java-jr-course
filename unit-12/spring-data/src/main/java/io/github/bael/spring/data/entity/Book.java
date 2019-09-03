package io.github.bael.spring.data.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Book {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private Integer year;



}
