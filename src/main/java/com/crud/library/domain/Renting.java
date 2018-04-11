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

    @ManyToOne
    @JoinColumn(name = "BOOK_ITEM_ID")
    private BookItem bookItem;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @Column(name = "RENTING_DATE")
    private Date rentingDate;

    @Column(name = "RETURN_DATE")
    private Date returnDate;

    public Renting(BookItem bookItem, User user, Date rentingDate) {
        this.bookItem = bookItem;
        this.user = user;
        this.rentingDate = rentingDate;
    }
}
