package com.example.teamwork.All.NoticeAnnouce.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "NoticeEntity")
@Table(name = "notice")
public class NoticeEntity {
    @Id
    @Column(name = "Notice_Id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "Notice_Type",nullable = false)
    private Long NoticeType;
    @Column(name = "Notice_Message",nullable = false)
    private String NoticeMessage;
    public Long getNoticeType() {
        return NoticeType;
    }
    public void setNoticeType(Long noticeType) {
        NoticeType = noticeType;
    }
    public String getNoticeMessage() {
        return NoticeMessage;
    }
    public void setNoticeMessage(String noticeMessage) {
        NoticeMessage = noticeMessage;
    }
}