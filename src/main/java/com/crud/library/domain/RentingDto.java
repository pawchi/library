package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RentingDto {
    private Long rentingId;
    private BookItem bookItem;
    private User user;
    private Date rentingDate;
    private Date returnDate;
}
