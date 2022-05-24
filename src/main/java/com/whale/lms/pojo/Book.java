package com.whale.lms.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {

    private Integer id;
    private String bookName;
    private String author;
    private Integer amount;
    private String brief;
    private String publishYear;

    public Book(Integer id) {
        this.id = id;
    }
}
