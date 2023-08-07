package com.fintech.bookstore.controllers;

import com.fintech.bookstore.model.dtos.BookDto;
import com.fintech.bookstore.model.entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/browse")
    public List<BookDto> browseAllBooks(){

    }

    @GetMapping("/browse/book/{id}")
    public BookDto browseById(@PathVariable id){

    }
}
