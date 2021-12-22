package com.example.teamwork.All.ShowBook.Repository;

import com.example.teamwork.All.ShowBook.Entity.BooklistEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookListRepository extends JpaRepository<BooklistEntity,Long> {
    @Query(value = "select t from BooklistEntity t where t.bookName like %?1%")
    List<BooklistEntity> FindByNameLike(String BookName);
    @Query(value = "delete from BooklistEntity  where bookName =?1")
    void DeleteByName(String BookName);
    @Query(value = "update BooklistEntity as book set book=?1 where book.bookName =?2")
    void ChangeBookInf(BooklistEntity booklistEntity,String Book_Name);
}
