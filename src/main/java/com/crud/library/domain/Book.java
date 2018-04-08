package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "BOOKS")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    //@NotNull
    @Column(name = "TITLEID", unique = true)
    private Long titleId;

    @Column(name ="TITLE")
    private String title;

    @Column(name ="AUTHOR")
    private String author;

    @Column(name ="PUBLICATIONYEAR")
    private int publicationYear;
}
