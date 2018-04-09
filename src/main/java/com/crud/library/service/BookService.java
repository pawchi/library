package com.crud.library.service;

import com.crud.library.domain.Book;
import com.crud.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book getBookById(final Long id) {
        return bookRepository.findOne(id);
    }

    public Book saveBook(final Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(final Long id) {
        bookRepository.delete(id);
    }
}
