package com.example.teamwork.All.ShowBook.Web;

import com.example.teamwork.All.ShowBook.Entity.BookListEntity;
import com.example.teamwork.All.ShowBook.Entity.BorrowWaitListEntity;
import com.example.teamwork.All.ShowBook.Entity.BorrowingRecordEntity;
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
        return borrowService.GetAllBorrowRecordList();
    }
    @RequestMapping(value = "/BorrowBook")
    public String BorrowBook(BorrowingRecordEntity BorrowingRecordEntity){
        try {
            borrowService.AddBorrowRecord(BorrowingRecordEntity);
            return "True";
        }catch (Exception e){return e.toString();}
    }
    @RequestMapping(value = "/ShowBorrowWaitList")
    public List<BorrowWaitListEntity> ShowBorrowWaitList(){
        return borrowService.GetAllBorrowWaitList();
    }
    @RequestMapping(value = "/BorrowBook")
    public String BorrowBook(String Book_Id,String User_Id){
        try {
            borrowService.BorrowBook(Book_Id,User_Id);
            return "True";
        }catch (Exception e){return e.toString();}
    }
}
