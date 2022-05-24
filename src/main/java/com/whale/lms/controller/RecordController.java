package com.whale.lms.controller;

import com.whale.lms.pojo.Book;
import com.whale.lms.pojo.Record;
import com.whale.lms.pojo.User;
import com.whale.lms.service.BookService;
import com.whale.lms.service.RecordService;
import com.whale.lms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;
import java.util.List;

@Controller
public class RecordController {

    RecordService recordService;
    BookService bookService;
    UserService userService;

    @Autowired
    public RecordController(RecordService recordService, BookService bookService, UserService userService) {
        this.recordService = recordService;
        this.bookService = bookService;
        this.userService = userService;
    }

    @GetMapping("/borrow")
    public String borrow(@RequestParam("bookId") Integer bookId, HttpSession session) {
        User user = (User) session.getAttribute("loginUser");
        Record record = new Record(0, user, new Book(bookId), LocalDateTime.now(), 0, 0);

        Book book = bookService.getBookById(bookId);
        book.setAmount(book.getAmount() - 1);
        bookService.updateBook(book);

        recordService.addRecord(record);
        return "redirect:/index";
    }

    @GetMapping("/record")
    public String record(HttpSession session) {
        User user = (User) session.getAttribute("loginUser");
        List<Record> borrowList = recordService.getBorrowRecordByUserId(user.getId());
        for (Record record : borrowList) {
            Book book = bookService.getBookById(record.getBook().getId());
            record.setBook(book);
        }
        session.setAttribute("borrowList", borrowList);
        return "record";
    }

    @GetMapping("/borrowRecord")
    public String borrowRecord(HttpSession session) {
        User user = (User) session.getAttribute("loginUser");
        List<Record> borrowedList = recordService.getBorrowedRecordByUserId(user.getId());
        for (Record record : borrowedList) {
            Book book = bookService.getBookById(record.getBook().getId());
            record.setBook(book);
        }
        session.setAttribute("borrowedList", borrowedList);
        return "borrowRecord";
    }

    @GetMapping("/returnRecord")
    public String returnRecord(HttpSession session) {
        User user = (User) session.getAttribute("loginUser");
        List<Record> returnList = recordService.getReturnRecordByUserId(user.getId());
        for (Record record : returnList) {
            Book book = bookService.getBookById(record.getBook().getId());
            record.setBook(book);
        }
        session.setAttribute("returnList", returnList);
        return "returnRecord";
    }

    @GetMapping("/giveBack")
    public String giveBack(@RequestParam("recordId") Integer recordId) {
        Record record = recordService.getRecordById(recordId);
        record.setBorrowId(-1);
        recordService.updateRecordBorrowId(record);

        Book book = bookService.getBookById(record.getBook().getId());
        book.setAmount(book.getAmount() + 1);
        bookService.updateBook(book);

        Record returnRecord = new Record(0, record.getUser(), book, LocalDateTime.now(), 1, record.getId());
        recordService.addRecord(returnRecord);

        return "redirect:/record";
    }

    @GetMapping("/allRecords")
    public String allRecords(@RequestParam(value = "pageNo", required = false) Integer pno,
                             HttpSession session) {
        Integer pageNo = 1;
        if (pno != null) {
            pageNo = pno;
        }
        List<Record> recordList = recordService.getRecordsByPageNo(pageNo);
        for (Record record : recordList) {
            Book book = bookService.getBookById(record.getBook().getId());
            User user = userService.getUserById(record.getUser().getId());
            record.setBook(book);
            record.setUser(user);
        }

        int recordCount = recordService.getAllRecordCount();
        int pageCount = (recordCount + 4) / 5;
        session.setAttribute("allRecords", recordList);
        session.setAttribute("recordPageNo", pageNo);
        session.setAttribute("recordPageCount", pageCount);
        return "allRecords";
    }
}
