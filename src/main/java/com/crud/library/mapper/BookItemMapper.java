package com.crud.library.mapper;

import com.crud.library.domain.Book;
import com.crud.library.domain.BookDto;
import com.crud.library.domain.BookItem;
import com.crud.library.domain.BookItemDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookItemMapper {
    public BookItem mapToBookItem(final BookItemDto bookItemDto) {
        return new BookItem(
                bookItemDto.getItemId(),
                bookItemDto.getBook(),
                bookItemDto.getStatus());
    }

    public BookItemDto mapToBookItemDto(final BookItem bookItem) {
        return new BookItemDto(
                bookItem.getItemId(),
                bookItem.getBook(),
                bookItem.getStatus());
    }

    public List<BookItemDto> mapToBookItemDtoList(final List<BookItem> bookList) {
        return bookList.stream()
                .map(t -> new BookItemDto(t.getItemId(), t.getBook(), t.getStatus()))
                .collect(Collectors.toList());
    }
}
