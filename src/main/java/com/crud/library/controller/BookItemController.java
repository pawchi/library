package com.crud.library.controller;

import com.crud.library.domain.BookItemDto;
import com.crud.library.mapper.BookItemMapper;
import com.crud.library.service.BookItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/bookItem")
@CrossOrigin(origins = "*")
public class BookItemController {
    @Autowired
    private BookItemService bookItemService;

    @Autowired
    private BookItemMapper bookItemMapper;

    @RequestMapping(method = RequestMethod.GET,value = "getBookItems")
    public List<BookItemDto> getBookItems(){
        return bookItemMapper.mapToBookItemDtoList(bookItemService.getAllBookItems());
    }

    @RequestMapping(method = RequestMethod.GET,value = "getBookItem")
    public BookItemDto getBookItem(@RequestParam ("itemId") Long itemId) throws BookItemNotFaundException{
        return bookItemMapper.mapToBookItemDto(bookItemService.getBookItemById(itemId));
    }

    @RequestMapping(method = RequestMethod.POST,value = "createBookItem",consumes = APPLICATION_JSON_VALUE)
    public void createBookItem(@RequestBody BookItemDto bookItemDto){
        bookItemService.saveBookItem(bookItemMapper.mapToBookItem(bookItemDto));
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "deleteBookItem")
    public void deleteBookItem(@RequestParam ("itemId") Long itemId) throws BookItemNotFaundException {
        bookItemService.deleteBookItem(itemId);
    }
}
