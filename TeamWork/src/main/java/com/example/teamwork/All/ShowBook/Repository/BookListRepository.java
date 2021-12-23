package com.example.teamwork.All.ShowBook.Repository;


import com.example.teamwork.All.ShowBook.Entity.BookListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookListRepository extends JpaRepository<BookListEntity,Long> {
    @Query(value = "select t from BookListEntity t where t.bookName like %?1%")
    List<BookListEntity> FindByNameLike(String BookName);
    @Query(value = "delete from BookListEntity  where id =?1")
    void DeleteByName(String Book_Id);
    @Query(value = "select t from BookListEntity t where t.id =?1")
    BookListEntity GetBookInf(String Book_Id);
}
