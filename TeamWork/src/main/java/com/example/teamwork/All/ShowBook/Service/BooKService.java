package com.example.teamwork.All.ShowBook.Service;


import com.example.teamwork.All.ShowBook.Entity.BookListEntity;

import java.util.List;
public interface BooKService {
    List GetAllBook();
    List GetSearchBook(String Sub);
    void CreateNewBook(BookListEntity booklistEntity);
    void DeleteBook(String Book_Name);
    void ChangeBookInf(BookListEntity booklistEntity);
}
