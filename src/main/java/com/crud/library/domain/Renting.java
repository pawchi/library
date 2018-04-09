package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "RENTING")
public class Renting {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "RENTING_ID", unique = true)
    private Long rentingId;

    @Column(name = "BOOK_ID")
    private BookItem bookItem;

    @Column(name = "USERID")
    private User user;

    @Column(name = "RENTINGDATE")
    private Date rentingDate;

    @Column(name = "RETURNDATE")
    private Date returnDate;

    public Renting(BookItem bookItem, User user, Date rentingDate) {
        this.bookItem = bookItem;
        this.user = user;
        this.rentingDate = rentingDate;
    }
}
