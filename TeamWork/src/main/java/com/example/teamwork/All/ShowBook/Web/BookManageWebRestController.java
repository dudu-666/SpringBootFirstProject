package com.example.teamwork.All.ShowBook.Web;

import com.example.teamwork.All.ShowBook.Entity.BookListEntity;
import com.example.teamwork.All.ShowBook.Entity.BorrowListEntity;
import com.example.teamwork.All.ShowBook.Repository.BorrowListRepository;
import com.example.teamwork.All.ShowBook.Service.BooKService;
import com.example.teamwork.All.ShowBook.Service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "BookManagement")
public class BookManageWebRestController {
    @Autowired
    private BooKService booKService;
    @Autowired
    private BorrowService borrowService;
    @RequestMapping(value = "/ShowAllBook")
    public List GetAllBook(){
        return booKService.GetAllBook();
    }
    @RequestMapping(value = "/SearchBook")
    public List SearchBook(String key){
        return booKService.GetSearchBook(key);
    }
    @RequestMapping(value = "/CreateNewBook")
    public String CreateNewBook(BookListEntity bookListEntity){
        try {
            booKService.CreateNewBook(bookListEntity);
            return "True";
        }catch (Exception e){return e.toString();}
    }
    @RequestMapping(value = "/ChangeBookInf")
    public String ChangeBookInf(BookListEntity bookListEntity){
        try {
            booKService.ChangeBookInf(bookListEntity);
            return "True";
        }catch (Exception e){return e.toString();}
    }
    @RequestMapping(value = "/ShowBorrowList")
    public List GetAllBorrowList(){
        return borrowService.GetAllBorrowList();
    }
    @RequestMapping(value = "/BorrowBook")
    public String BorrowBook(BorrowListEntity borrowListEntity){
        try {
            borrowService.AddBorrowRecord(borrowListEntity);
            return "True";
        }catch (Exception e){return e.toString();}
    }
}
