package com.whale.lms.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Record {
    private Integer id;
    private User user;
    private Book book;
    private LocalDateTime date;
    private Integer status;//0 - 借阅, 1 - 归还
    private Integer borrowId;
}
