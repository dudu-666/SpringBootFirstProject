package com.example.teamwork.All.ShowBook.Repository;

import com.example.teamwork.All.ShowBook.Entity.BorrowWaitListEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowWaitListRepository extends JpaRepository<BorrowWaitListEntity,Long> {
}
