package com.crud.library.service;

import com.crud.library.domain.BookItem;
import com.crud.library.repository.BookItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookItemService {
    @Autowired
    private BookItemRepository bookItemRepository;

    public BookItem getBookItemById(Long id) {
        return bookItemRepository.findOne(id);
    }

    public BookItem saveBookItem(BookItem bookItem) {
        return bookItemRepository.save(bookItem);
    }
}
