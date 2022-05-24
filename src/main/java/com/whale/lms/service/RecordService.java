package com.whale.lms.service;

import com.whale.lms.pojo.Record;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecordService {

    void addRecord(Record record);

    List<Record> getBorrowRecordByUserId(Integer id);

    List<Record> getReturnRecordByUserId(Integer id);

    Record getRecordById(Integer id);

    void updateRecordBorrowId(Record record);

    List<Record> getAllRecords();

    List<Record> getBorrowedRecordByUserId(@Param("user_id") Integer id);

    List<Record> getRecordsByPageNo(Integer pageNo);

    Integer getAllRecordCount();
}
