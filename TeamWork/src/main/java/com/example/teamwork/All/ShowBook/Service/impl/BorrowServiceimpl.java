package com.example.teamwork.All.ShowBook.Service.impl;

import com.example.teamwork.All.ShowBook.Entity.BookListEntity;
import com.example.teamwork.All.ShowBook.Entity.BorrowingRecordEntity;
import com.example.teamwork.All.ShowBook.Repository.BookListRepository;
import com.example.teamwork.All.ShowBook.Repository.BorrowWaitListRepository;
import com.example.teamwork.All.ShowBook.Repository.BorrowingRecordRepository;
import com.example.teamwork.All.ShowBook.Service.BorrowService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class BorrowServiceimpl implements BorrowService {
    @Resource
    BookListRepository bookListRepository;
    @Resource
    BorrowingRecordRepository borrowingRecordRepository;
    @Resource
    BorrowWaitListRepository borrowWaitListRepository;
    @Override
    public List GetAllBorrowRecordList() {
        return borrowingRecordRepository.findAll();
    }
    @Override
    public void AddBorrowRecord(BorrowingRecordEntity BorrowingRecordEntity) {
        borrowingRecordRepository.save(BorrowingRecordEntity);
    }

    @Override
    public List GetAllBorrowWaitList() {
        return borrowWaitListRepository.findAll();
    }

    @Override
    public List GetAllBorrowRecords() {
        return borrowingRecordRepository.findAll();
    }

    @Override
    public void BorrowBook(BorrowingRecordEntity borrowingRecordEntity) {borrowingRecordRepository.save(borrowingRecordEntity);}

    @Override
    public void ReturnBook(String Book_Id,String User_Id) {
        BookListEntity bookListEntity=bookListRepository.GetBookInf(Book_Id);
        bookListEntity.setBookStatus("未借出");
        bookListRepository.save(bookListEntity);
        borrowingRecordRepository.delete(borrowingRecordRepository.FindByUidAndBid(User_Id,Book_Id));
    }
}
