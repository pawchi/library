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
    private BookItemRepository bookItemRepository;

    @Autowired
    private UserRepository userRepository;

    public Renting rentBookByUser (Long itemId, Long userId){

        BookItem bookItem = bookItemRepository.findOne(itemId);
        User user = userRepository.findOne(userId);

        Date date = new Date();

        Renting renting = new Renting(bookItem,user,date);
        return rentingRepository.save(renting);
    }
}
