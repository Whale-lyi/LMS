package com.whale.lms.service.impl;

import com.github.pagehelper.PageHelper;
import com.whale.lms.mapper.BookMapper;
import com.whale.lms.pojo.Book;
import com.whale.lms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    BookMapper bookMapper;

    @Autowired
    public BookServiceImpl(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookMapper.getAllBooks();
    }

    @Override
    public List<Book> getBooksByPageNo(Integer pageNo, String keyword) {
        PageHelper.startPage(pageNo, 5);
        List<Book> list = bookMapper.getBookByKeyword(keyword);
        return list;
    }

    @Override
    public Integer getBookCount(String keyword) {
        return bookMapper.getBookCount(keyword);
    }

    @Override
    public void addBook(Book book) {
        bookMapper.insertBook(book);
    }

    @Override
    public Book getBookById(Integer id) {
        return bookMapper.getBookById(id);
    }

    @Override
    public void updateBook(Book book) {
        bookMapper.updateBook(book);
    }
}
