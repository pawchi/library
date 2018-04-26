package com.crud.library.mapper;

import com.crud.library.domain.Book;
import com.crud.library.domain.BookDto;
import com.crud.library.domain.BookItem;
import com.crud.library.domain.BookItemDto;
import com.crud.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookItemMapper {
    @Autowired
    private BookService bookService;
    public BookItem mapToBookItem(final BookItemDto bookItemDto) {
        Book book = bookService.getBookById(bookItemDto.getBookId());
        return new BookItem(
                bookItemDto.getItemId(),
                book,
                bookItemDto.getStatus());
    }

    public BookItemDto mapToBookItemDto(final BookItem bookItem) {

        return new BookItemDto(
                bookItem.getItemId(),
                bookItem.getBook().getTitleId(),
                bookItem.getStatus());
    }

    public List<BookItemDto> mapToBookItemDtoList(final List<BookItem> bookList) {
        return bookList.stream()
                .map(t -> new BookItemDto(t.getItemId(), t.getBook().getTitleId(), t.getStatus()))
                .collect(Collectors.toList());
    }
}
