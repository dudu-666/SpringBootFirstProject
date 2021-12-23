package com.example.teamwork.All.ShowBook.Web;

import com.example.teamwork.All.ShowBook.Entity.BookListEntity;
import com.example.teamwork.All.ShowBook.Service.BooKService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "BookManagement")
public class ShowBookWebRestController {
    @Autowired
    private BooKService booKService;
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
}
