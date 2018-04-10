package com.crud.library.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class RentingRequestDto {
    private Long userId;
    private Long bookItemId;
}
