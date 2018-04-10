package com.crud.library.mapper;

import com.crud.library.domain.Book;
import com.crud.library.domain.BookDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookMapper {
    public Book mapToBook(final BookDto bookDto){
        return new Book(
                bookDto.getTitleId(),
                bookDto.getTitle(),
                bookDto.getAuthor(),
                bookDto.getPublicationYear());
    }

    public BookDto mapToBookDto(final Book book){
        return new BookDto(
                book.getTitleId(),
                book.getTitle(),
                book.getAuthor(),
                book.getPublicationYear());
    }

    public List<BookDto> mapToBookDtoList(final List<Book> bookList){
        return bookList.stream()
                .map(t -> new BookDto(t.getTitleId(),t.getTitle(),t.getAuthor(),t.getPublicationYear()))
                .collect(Collectors.toList());
    }
}
