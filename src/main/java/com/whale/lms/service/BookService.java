package com.whale.lms.service;

import com.whale.lms.pojo.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();

    List<Book> getBooksByPageNo(Integer pageNo, String keyword);

    Integer getBookCount(String keyword);

    void addBook(Book book);

    Book getBookById(Integer id);

    void updateBook(Book book);
}
