package com.example.teamwork.All.NoticeAnnouce.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "NoticeEntity")
@Table(name = "notice")
public class NoticeEntity {
    @Id
    @Column(name = "NoticeId", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "NoticeType",nullable = false)
    private Long NoticeType;
    @Column(name = "NoticeMessage",nullable = false)
    private Long NoticeMessage;
    public Long getNoticeType() {
        return NoticeType;
    }
    public void setNoticeType(Long noticeType) {
        NoticeType = noticeType;
    }
    public Long getNoticeMessage() {
        return NoticeMessage;
    }
    public void setNoticeMessage(Long noticeMessage) {
        NoticeMessage = noticeMessage;
    }
}