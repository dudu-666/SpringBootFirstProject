package com.example.teamwork.All.NoticeAnnouce.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnnouceWebController {
    @RequestMapping(value = "AnnouceAndNotice")
    public String AnnouceAndNotice(){
        return "reform";
    }
}
