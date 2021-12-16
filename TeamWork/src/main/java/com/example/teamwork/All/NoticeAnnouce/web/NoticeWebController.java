package com.example.teamwork.All.NoticeAnnouce.web;

import com.example.teamwork.All.NoticeAnnouce.Service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoticeWebController {
    @Autowired
    NoticeService noticeService;
    @RequestMapping("GetAllNotice")
    public List GetAllNotice(){
        return noticeService.GetAllNotice();
    }
}
