package com.example.teamwork.All.NoticeAnnouce.Service.impl;

import com.example.teamwork.All.NoticeAnnouce.Entity.NoticeEntity;
import com.example.teamwork.All.NoticeAnnouce.Repository.NoticeRepository;
import com.example.teamwork.All.NoticeAnnouce.Service.NoticeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class NoticeServiceimpl implements NoticeService {
    @Resource
    NoticeRepository noticeRepository;

    @Override
    public List GetAllNotice() {
        return noticeRepository.findAll();
    }
}
