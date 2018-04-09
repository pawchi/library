package com.crud.library.mapper;

import com.crud.library.domain.BookItem;
import com.crud.library.domain.BookItemDto;
import org.springframework.stereotype.Component;

@Component
public class BookItemMapper {
    public BookItem mapToBookItem(BookItemDto bookItemDto){
        return new BookItem(
                bookItemDto.getItemId(),
                bookItemDto.getBook(),
                bookItemDto.getStatus());
    }

    public BookItemDto mapToBookItemDto(BookItem bookItem){
        return new BookItemDto(
                bookItem.getItemId(),
                bookItem.getBook(),
                bookItem.getStatus());
    }
}
