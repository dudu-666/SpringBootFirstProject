package com.example.teamwork.All.ShowBook.Service.impl;

import com.example.teamwork.All.ShowBook.Entity.BookListEntity;
import com.example.teamwork.All.ShowBook.Repository.BookListRepository;
import com.example.teamwork.All.ShowBook.Service.BooKService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class BookServiceimpl implements BooKService {
    @Resource
    BookListRepository bookListRepository;

    @Override
    public List GetAllBook() {
        return bookListRepository.findAll();
    }

    @Override
    public List GetSearchBook(String Sub) {
        return bookListRepository.FindByNameLike(Sub);
    }

    @Override
    public void CreateNewBook(BookListEntity booklistEntity) {
        try {
            bookListRepository.save(booklistEntity);
        }catch (Exception e){System.out.println(e);}
    }

    @Override
    public void DeleteBook(String Book_Id) {
        try {
            bookListRepository.DeleteByName(Book_Id);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    @Override
    public void ChangeBookInf(BookListEntity booklistEntity) {
        try {bookListRepository.save(booklistEntity);
        }catch (Exception e){System.out.println(e);}
    }
}
