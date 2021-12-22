package com.example.teamwork.All.NoticeAnnouce.Service;
import com.example.teamwork.All.NoticeAnnouce.Entity.AnnouceEntity;
import java.util.List;

public interface AnnouceService {
    List GetAllAnnouce();
    void AddAnnouce(AnnouceEntity annouceEntity);
}
