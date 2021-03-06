package com.example.teamwork.All.ShowBook.Controller;

import com.example.teamwork.All.Model.BookInformation;
import com.example.teamwork.All.ShowBook.Dao.BookChange;
import com.example.teamwork.All.ShowBook.Dao.DeleteBook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class BookManagementController {
    @RequestMapping(value = "BookManagementController")
    public String BookManagementControl(){
        return "tushu(1)";
    }
    @RequestMapping(value = "BookManagementDelete", method = RequestMethod.GET)
    public void Delete(HttpServletRequest request, HttpServletResponse response){
        new DeleteBook(request.getParameter("id")).Delete();
        System.out.println(request.getParameter("id"));
        response.setStatus(200);
    }
    @RequestMapping(value = "BookManagementChange" ,method = RequestMethod.POST)
    @ResponseBody
    public String Change(BookInformation bookInformation){
        String Back;
        try {
            new BookChange(bookInformation).BookChange();
            Back="Yes";
            return Back;
        }catch (Exception e){Back="No";return Back;}
    }
}
