package com.example.teamwork.All.ShowBook.Repository;

import com.example.teamwork.All.ShowBook.Entity.BooklistEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookListRepository extends JpaRepository<BooklistEntity,Long> {
}
