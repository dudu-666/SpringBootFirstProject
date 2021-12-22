package com.example.teamwork.All.ShowBook.Service;
import com.example.teamwork.All.ShowBook.Entity.BooklistEntity;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface BooKService {
    List GetAllBook();
    List GetSearchBook(String Sub);
    void CreateNewBook(BooklistEntity booklistEntity);
    void DeleteBook(String Book_Name);
    void ChangeBookInf(BooklistEntity booklistEntity);
}
