package com.example.teamwork.All.ShowBook.Repository;

import com.example.teamwork.All.ShowBook.Entity.BooklistEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookListRepository extends JpaRepository<BooklistEntity,Long> {
    @Query(value = "select t from BooklistEntity t where t.bookName like %?1%")
    List<BooklistEntity> FindByNameLike(String Name);
}
