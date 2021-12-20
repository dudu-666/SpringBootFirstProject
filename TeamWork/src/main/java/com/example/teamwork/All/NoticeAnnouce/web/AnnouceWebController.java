package com.example.teamwork.All.NoticeAnnouce.web;

import com.example.teamwork.All.NoticeAnnouce.Entity.AnnouceEntity;
import com.example.teamwork.All.NoticeAnnouce.Service.AnnouceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnnouceWebController {
    @Autowired
    AnnouceService annouceService;
    @RequestMapping(value = "GetAllAnnouce")
    public List GetAllAnnouce(){
        return annouceService.GetAllAnnouce();
    }
    @RequestMapping(value = "AddAnnouce")
    public String AddAnnouce(AnnouceEntity annouceEntity) {
        try {
            annouceService.AddAnnouce(annouceEntity);
            return "true";
        }catch (Exception e){return "false";}
    }
}
