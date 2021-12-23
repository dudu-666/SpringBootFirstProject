package com.example.teamwork.All.ShowBook.RestController;

import com.example.teamwork.All.Model.BookInformation;
import com.example.teamwork.All.ShowBook.Dao.BookChange;
import com.example.teamwork.All.ShowBook.Dao.DeleteBook;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookManagementRestController {
    @RequestMapping("BookManagementRestDelete")
    public String DeleteResultReturn(String id){
        StringBuilder str=new StringBuilder();
        try {
            if(new DeleteBook(id).Delete()){
                return str.append("").toString();
            }
            else {
                str.append("");
                return str.append("").toString();
            }
        }catch (Exception e){
            return str.append(e).toString();
        }
    }
    @RequestMapping("BookManagementRestChange")
    public String BookChangeResultReturn(BookInformation bookInformation){
        StringBuilder str=new StringBuilder();
        try {
            if(new BookChange(bookInformation).BookChange()){
                return str.append("").toString();
            }else {
                return str.append("").toString();
            }
        }catch (Exception e){
            return str.append(e).toString();
        }
    }
}
