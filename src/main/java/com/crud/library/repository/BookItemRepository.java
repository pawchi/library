package com.crud.library.repository;

import com.crud.library.domain.BookItem;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookItemRepository extends CrudRepository<BookItem,Long> {
    @Override
    List<BookItem> findAll();
}
