package com.fintech.bookstore.controllers;

import com.fintech.bookstore.model.entity.Book;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/manage")
public class BookAdminController {

    @PostMapping("/add")
    public String addBook(@RequestBody Book book){

    }

    @GetMapping("/check/{id}")
    public int checkBookQuantity(@PathVariable id){

    }

    @DeleteMapping("/remove/{id}")
    public String buyBook(@PathVariable id){

    }

    @PutMapping("/update")
    public String updateBookInformation(@RequestBody Book book){

    }
}
