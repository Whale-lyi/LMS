package com.whale.lms.controller;

import com.whale.lms.pojo.Book;
import com.whale.lms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {

    BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/add")
    public String addPage() {
        return "add";
    }

    @PostMapping("/add")
    public String addBook(Book book) {
        bookService.addBook(book);
        return "redirect:/index?pageNo=1";
    }

    @GetMapping("/see")
    public String infoPage(@RequestParam("bookId") Integer id, Model model) {
        Book book = bookService.getBookById(id);
        model.addAttribute("book", book);
        return "bookinfo";
    }

    @GetMapping("/edit")
    public String editPage(@RequestParam("bookId") Integer id, Model model) {
        Book book = bookService.getBookById(id);
        model.addAttribute("book", book);
        return "edit";
    }

    @PostMapping("/edit")
    public String editBook(Book book) {
        bookService.updateBook(book);
        return "redirect:/index?pageNo=1";
    }
}
