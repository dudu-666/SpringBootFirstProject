package com.example.teamwork.All.NoticeAnnouce.Service;

import com.example.teamwork.All.NoticeAnnouce.Entity.AnnouceEntity;

import java.util.List;

public interface AnnouceService {
    List<AnnouceEntity> GetAllAnnouce();
    void AddAnnouce(AnnouceEntity annouceEntity);
}
