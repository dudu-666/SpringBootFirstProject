package com.example.teamwork.All.ShowBook.Service;

import com.example.teamwork.All.ShowBook.Entity.BorrowListEntity;

import java.util.List;

public interface BorrowService {
    List GetAllBorrowList();
    void AddBorrowRecord(BorrowListEntity borrowlistEntity);
}
