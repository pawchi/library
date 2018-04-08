package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RentingDto {
    private Long itemId;
    private Long userId;
    private LocalDate rentingDate;
    private LocalDate returnDate;
}
