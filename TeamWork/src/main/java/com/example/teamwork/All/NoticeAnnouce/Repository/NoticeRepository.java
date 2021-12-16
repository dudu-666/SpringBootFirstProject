package com.example.teamwork.All.NoticeAnnouce.Repository;

import com.example.teamwork.All.NoticeAnnouce.Entity.NoticeConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepository extends JpaRepository<NoticeConfig, Long> {
}
