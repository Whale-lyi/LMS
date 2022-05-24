package com.whale.lms.mapper;

import com.whale.lms.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BookMapper {

    List<Book> getAllBooks();

    Integer getBookCount(@Param("keyword") String keyword);

    void insertBook(Book book);

    Book getBookById(@Param("id") Integer id);

    void updateBook(Book book);

    List<Book> getBookByKeyword(@Param("keyword") String keyword);
}
