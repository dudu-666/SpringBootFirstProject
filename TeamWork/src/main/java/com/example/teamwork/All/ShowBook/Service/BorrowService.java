package com.example.teamwork.All.ShowBook.Service;

import com.example.teamwork.All.ShowBook.Entity.BookListEntity;
import com.example.teamwork.All.ShowBook.Entity.BorrowWaitListEntity;
import com.example.teamwork.All.ShowBook.Entity.BorrowingRecordEntity;

import java.util.List;

public interface BorrowService {
    List<BorrowingRecordEntity> GetAllBorrowRecordList();
    void AddBorrowRecord(BorrowingRecordEntity BorrowingRecordEntity);
    List<BorrowWaitListEntity> GetAllBorrowWaitList();
    void BorrowBook(String Book_Id,String User_Id);
    void ReturnBook(String Book_Id,String User_Id);

}
