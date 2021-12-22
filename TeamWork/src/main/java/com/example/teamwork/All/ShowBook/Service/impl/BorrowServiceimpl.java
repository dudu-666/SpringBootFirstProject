package com.example.teamwork.All.ShowBook.Service.impl;

import com.example.teamwork.All.ShowBook.Entity.BorrowListEntity;
import com.example.teamwork.All.ShowBook.Repository.BorrowListRepository;
import com.example.teamwork.All.ShowBook.Service.BorrowService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class BorrowServiceimpl implements BorrowService {
    @Resource
    BorrowListRepository borrowListRepository;
    @Override
    public List GetAllBorrowList() {
        return borrowListRepository.findAll();
    }
    @Override
    public void AddBorrowRecord(BorrowListEntity borrowlistEntity) {
        borrowListRepository.save(borrowlistEntity);
    }
}
