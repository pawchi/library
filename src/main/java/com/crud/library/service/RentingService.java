package com.crud.library.service;

import com.crud.library.domain.BookItem;
import com.crud.library.domain.Renting;
import com.crud.library.domain.User;
import com.crud.library.repository.BookItemRepository;
import com.crud.library.repository.RentingRepository;
import com.crud.library.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RentingService {

    @Autowired
    private RentingRepository rentingRepository;

    @Autowired
    private BookItemService bookItemService;

    @Autowired
    private UserService userService;

    public Renting rentBookByUser (final Long bookItemId,final Long userId){

        BookItem bookItem = bookItemService.getBookItemById(bookItemId);
        User user = userService.getUserById(userId);
        Date date = new Date();

        Renting renting = new Renting(bookItem,user,date);
        return rentingRepository.save(renting);
    }
}
