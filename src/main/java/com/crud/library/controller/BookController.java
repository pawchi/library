package com.crud.library.controller;


import com.crud.library.domain.Book;
import com.crud.library.domain.BookDto;
import com.crud.library.mapper.BookMapper;
import com.crud.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/book")
@CrossOrigin(origins = "*")
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private BookMapper bookMapper;

    @RequestMapping(method = RequestMethod.GET,value = "getBooks")
    public List<BookDto> getBooks(){
        return bookMapper.mapToBookDtoList(bookService.getAllBooks());
    }

    @RequestMapping(method = RequestMethod.GET,value = "getBook")
    public BookDto getBook(@RequestParam ("titleId") Long titleId) throws BookNotFaundException{
        return bookMapper.mapToBookDto(bookService.getBookById(titleId));
    }

    @RequestMapping(method = RequestMethod.POST,value = "createBook",consumes = APPLICATION_JSON_VALUE)
    public void createBook(@RequestBody BookDto bookDto){
        bookService.saveBook(bookMapper.mapToBook(bookDto));
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "deleteBook")
    public void deleteBook(@RequestParam ("titleId") Long titleId) throws BookNotFaundException{
        bookService.deleteBook(titleId);
    }
}
