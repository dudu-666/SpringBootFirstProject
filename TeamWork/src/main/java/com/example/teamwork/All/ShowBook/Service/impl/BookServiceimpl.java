package com.example.teamwork.All.ShowBook.Service.impl;
import com.example.teamwork.All.ShowBook.Entity.BooklistEntity;
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
    public void CreateNewBook(BooklistEntity booklistEntity) {
        try {
            bookListRepository.save(booklistEntity);
        }catch (Exception e){System.out.println(e);}
    }

    @Override
    public void DeleteBook(String Book_Name) {
        try {
            bookListRepository.DeleteByName(Book_Name);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    @Override
    public void ChangeBookInf(BooklistEntity booklistEntity) {
        try {
            bookListRepository.ChangeBookInf(booklistEntity,booklistEntity.getBookName());
        }catch (Exception e){System.out.println(e);}
    }
}
