package com.crud.library.mapper;

import com.crud.library.domain.Renting;
import com.crud.library.domain.RentingDto;

public class RentingMapper {
    public Renting mapToRenting(RentingDto rentingDto){
        return new Renting(
                rentingDto.getRentingId(),
                rentingDto.getBookItem(),
                rentingDto.getUser(),
                rentingDto.getRentingDate(),
                rentingDto.getReturnDate());

    }

    public RentingDto mapToRentingDto(Renting renting){
        return new RentingDto(
                renting.getRentingId(),
                renting.getBookItem(),
                renting.getUser(),
                renting.getRentingDate(),
                renting.getReturnDate());
    }
}
