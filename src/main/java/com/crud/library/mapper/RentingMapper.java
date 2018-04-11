package com.crud.library.mapper;

import com.crud.library.domain.Renting;
import com.crud.library.domain.RentingDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RentingMapper {
    public Renting mapToRenting(final RentingDto rentingDto){
        return new Renting(
                rentingDto.getRentingId(),
                rentingDto.getBookItem(),
                rentingDto.getUser(),
                rentingDto.getRentingDate(),
                rentingDto.getReturnDate());

    }

    public RentingDto mapToRentingDto(final Renting renting){
        return new RentingDto(
                renting.getRentingId(),
                renting.getBookItem(),
                renting.getUser(),
                renting.getRentingDate(),
                renting.getReturnDate());
    }

    public List<RentingDto> mapToRentingDtoList(final List<Renting> rentingList){
        return rentingList.stream()
                .map(t-> new RentingDto(t.getRentingId(),t.getBookItem(),t.getUser(),t.getRentingDate(),t.getReturnDate()))
                .collect(Collectors.toList());
    }
}
