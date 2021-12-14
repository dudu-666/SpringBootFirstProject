package com.example.teamwork.All.show.controller;

import com.example.teamwork.All.show.dao.deletemember;
import com.example.teamwork.All.show.dao.showmember;
import com.example.teamwork.All.show.dao.updatemember;
import com.example.teamwork.All.show.model.MemberInfo;
import com.example.teamwork.All.show.dao.deletemember;
import com.example.teamwork.All.show.dao.showmember;
import com.example.teamwork.All.show.dao.updatemember;
import com.example.teamwork.All.show.model.MemberInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

@Controller
public class showcontroller {

    @RequestMapping(path="showController")
    public String showgrmp() {return "test0";}
    @RequestMapping(path="returnlogin")
    public String UserLogin(){
        return "UserLogin";
    }

      /** @RequestMapping(path="UserLoginController",method = RequestMethod.POST)
        public String UserLogin() {return "UserLogin";}*/
      @RequestMapping(value = "showteam")
      @ResponseBody
      public List showteam()
      {
          showmember show=new showmember();
          return show.Getlist();
      }
    /**
     *��ѯͼƬ
     */
    @RequestMapping(path="showteam/img")
    public void findphotoBysno(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        byte[] photo = null;
        String sno=request.getParameter("sno");
        MemberInfo mem  = new MemberInfo();
        photo=mem.getPhoto();
        OutputStream outputStream = response.getOutputStream();
        outputStream.write(photo);
        outputStream.flush();
        outputStream.close();
    }

    @RequestMapping(path="memberdelete",method = RequestMethod.GET)
      public String del(HttpServletRequest request){
          String id=request.getParameter("id");
          deletemember deletemember=new deletemember(id);
         deletemember.Delete();
         System.out.println(id);
         return "redirect:test0";
     }
     @RequestMapping(path="memberupdate",method =RequestMethod.POST)
     @ResponseBody
     public String update(MemberInfo memberInfo) {

         System.out.println(memberInfo.toString());
         try {
             new updatemember(memberInfo).Update();
             return "Y";

         } catch (Exception e) {
             return "F";
         }
     }
}
