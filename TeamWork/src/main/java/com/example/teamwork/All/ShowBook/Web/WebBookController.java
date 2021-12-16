package com.example.teamwork.All.ShowBook.Web;

import com.example.teamwork.All.ShowBook.Service.BooKService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class WebBookController {
    @Autowired
    BooKService booKService;
    @RequestMapping("BookManagementShow")
    public List GetAllBook(){
        return booKService.GetAllBook();
    }
}
