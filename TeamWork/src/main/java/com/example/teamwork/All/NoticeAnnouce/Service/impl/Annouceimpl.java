package com.example.teamwork.All.NoticeAnnouce.Service.impl;

import com.example.teamwork.All.NoticeAnnouce.Entity.AnnouceEntity;
import com.example.teamwork.All.NoticeAnnouce.Repository.AnnouceRepository;
import com.example.teamwork.All.NoticeAnnouce.Service.AnnouceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class Annouceimpl implements AnnouceService {
    @Resource
    AnnouceRepository annouceRepository;
    @Override
    public List GetAllAnnouce() {
        return annouceRepository.findAll();
    }
    @Override
    public void AddAnnouce(AnnouceEntity annouceEntity) {
        annouceRepository.save(annouceEntity);
    }
}
