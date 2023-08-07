package com.fintech.bookstore.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookDto {

    private int id;
    private String name;
    private int quantity;
    private boolean isAvailable;
    private int price;
}

