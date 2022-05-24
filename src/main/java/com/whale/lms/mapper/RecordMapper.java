package com.whale.lms.mapper;

import com.whale.lms.pojo.Record;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RecordMapper {

    void addRecord(Record record);

    List<Record> getBorrowRecordByUserId(@Param("user_id") Integer id);

    List<Record> getBorrowedRecordByUserId(@Param("user_id") Integer id);

    List<Record> getReturnRecordByUserId(@Param("user_id") Integer id);

    Record getRecordById(@Param("id") Integer id);

    void updateRecordBorrowId(Record record);

    List<Record> getAllRecords();

    Integer getAllRecordCount();
}
