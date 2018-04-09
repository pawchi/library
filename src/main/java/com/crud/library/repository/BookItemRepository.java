package com.crud.library.repository;

import com.crud.library.domain.BookItem;
import org.springframework.data.repository.CrudRepository;

public interface BookItemRepository extends CrudRepository<BookItem,Long> {
}
