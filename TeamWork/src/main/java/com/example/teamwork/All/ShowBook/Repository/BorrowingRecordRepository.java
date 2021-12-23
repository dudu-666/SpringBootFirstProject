package com.example.teamwork.All.ShowBook.Repository;

import com.example.teamwork.All.ShowBook.Entity.BorrowingRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BorrowingRecordRepository extends JpaRepository<BorrowingRecordEntity,Long> {
    @Query(value = "select t from BorrowingRecordEntity t where t.book =?1 and t.user=?2")
    BorrowingRecordEntity FindByUidAndBid(String User_Id,String Book_Id);
}
