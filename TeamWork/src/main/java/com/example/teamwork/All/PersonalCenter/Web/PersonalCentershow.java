package com.example.teamwork.All.PersonalCenter.Web;

import com.example.teamwork.All.login.Entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.FastByteArrayOutputStream;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class PersonalCentershow {
    @RequestMapping(value="getUserSession")
    public String getUser(HttpSession httpSession){
        Object ob=httpSession.getAttribute("UserInformation");
        UserEntity userEntity=(UserEntity) ob;
        System.out.println(userEntity.toString());
        return "PersonalCenter";
    }



}
