package com.example.teamwork.All.ShowBook.Web;

import com.example.teamwork.All.ShowBook.Service.BooKService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShowBookWebController {
    @Autowired
    private BooKService booKService;
    @RequestMapping(value = "BookManagementShow")
    public List GetAllBook(){
        return booKService.GetAllBook();
    }
    @RequestMapping(value = "BookManagementSearchBook")
    public List SearchBook(String key){
        return booKService.GetSearchBook(key);
    }
}
