package com.whale.lms.service.impl;

import com.github.pagehelper.PageHelper;
import com.whale.lms.mapper.RecordMapper;
import com.whale.lms.pojo.Record;
import com.whale.lms.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {

    RecordMapper recordMapper;

    @Autowired
    public RecordServiceImpl(RecordMapper recordMapper) {
        this.recordMapper = recordMapper;
    }

    @Override
    public void addRecord(Record record) {
        recordMapper.addRecord(record);
    }

    @Override
    public List<Record> getBorrowRecordByUserId(Integer id) {
        return recordMapper.getBorrowRecordByUserId(id);
    }

    @Override
    public List<Record> getReturnRecordByUserId(Integer id) {
        return recordMapper.getReturnRecordByUserId(id);
    }

    @Override
    public Record getRecordById(Integer id) {
        return recordMapper.getRecordById(id);
    }

    @Override
    public void updateRecordBorrowId(Record record) {
        recordMapper.updateRecordBorrowId(record);
    }

    @Override
    public List<Record> getAllRecords() {
        return recordMapper.getAllRecords();
    }

    @Override
    public List<Record> getBorrowedRecordByUserId(Integer id) {
        return recordMapper.getBorrowedRecordByUserId(id);
    }

    @Override
    public List<Record> getRecordsByPageNo(Integer pageNo) {
        PageHelper.startPage(pageNo, 5);
        List<Record> list = getAllRecords();
        return list;
    }

    @Override
    public Integer getAllRecordCount() {
        return recordMapper.getAllRecordCount();
    }
}
