package com.whale.lms.controller;

import com.whale.lms.pojo.Book;
import com.whale.lms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class IndexController {

    BookService bookService;

    @Autowired
    public IndexController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/index")
    public String index(@RequestParam(value = "pageNo", required = false) Integer pno,
                        HttpSession session) {
        Integer pageNo = 1;
        if (pno != null) {
            pageNo = pno;
        }

        String keyword = (String) session.getAttribute("keyword");

        if (keyword == null || keyword.equals("")) {
            keyword = "";
        }
        List<Book> list = bookService.getBooksByPageNo(pageNo, keyword);

        int bookCount = bookService.getBookCount(keyword);
        int pageCount = (bookCount + 4) / 5;

        session.setAttribute("pageNo", pageNo);
        session.setAttribute("bookList", list);
        session.setAttribute("pageCount", pageCount);
        return "index";
    }

    @PostMapping("/search")
    public String search(@RequestParam("keyword") String keyword, HttpSession session) {
        session.setAttribute("keyword", keyword);
        return "redirect:/index";
    }
}
