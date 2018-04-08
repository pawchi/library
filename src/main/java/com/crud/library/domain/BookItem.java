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
@Entity(name = "ITEMS")
public class BookItem {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    //@NotNull
    @Column(name = "ITEMID", unique = true)
    private Long itemId;

    @Column(name = "TITLEID")
    private Long titleId;

    @Column(name = "STATUS")
    private String status;
}
