package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "RENTING")
public class Renting {
    @Column(name = "ITEMID")
    private Long itemId;

    @Column(name = "USERID")
    private Long userId;

    @Column(name = "RENTINGDATE")
    private LocalDate rentingDate;

    @Column(name = "RETURNDATE")
    private LocalDate returnDate;
}
