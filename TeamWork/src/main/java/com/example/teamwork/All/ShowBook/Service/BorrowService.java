package com.example.teamwork.All.ShowBook.Service;

import com.example.teamwork.All.ShowBook.Entity.BorrowingRecordEntity;

import java.util.List;

public interface BorrowService {
    List GetAllBorrowRecordList();
    void AddBorrowRecord(BorrowingRecordEntity BorrowingRecordEntity);
    List GetAllBorrowWaitList();
    List GetAllBorrowRecords();
    void BorrowBook(BorrowingRecordEntity borrowingRecordEntity);
    void ReturnBook(String Book_Id,String User_Id);

}
