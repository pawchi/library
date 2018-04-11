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
    @Column(name = "ITEMID", unique = true)
    private Long itemId;

    @ManyToOne
    @JoinColumn(name = "BOOK_ID")//(foreignKey = @ForeignKey(name = "BOOK_ID"),nullable = false)
    private Book book;

    @Column(name = "STATUS")
    private String status;
}
