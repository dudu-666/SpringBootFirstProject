package com.example.teamwork.All.login.Web;

import com.example.teamwork.All.login.Entity.UserEntity;
import com.example.teamwork.All.login.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Column;
import javax.servlet.http.HttpSession;

@Controller
public class WebLoginController {
    @Autowired
    LoginService loginService;
    @RequestMapping(value = "UserLoginController")
    public String Login(String LoginName, String PassWord, HttpSession httpSession){
        UserEntity userEntity=loginService.Login(LoginName,PassWord);
        if(userEntity!=null) {
            httpSession.setAttribute("UserInformation",userEntity);
            return "Main01";
        }
        else return "Login";
    }
}
