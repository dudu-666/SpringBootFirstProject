package com.example.teamwork.All.NoticeAnnouce.Entity;

import javax.persistence.*;

@Entity(name = "Annouce")
@Table(name = "annouce")
public class AnnouceEntity {
    @Id
    @Column(name = "Annouce_Id", nullable = false, length = 40)
    private String id;

    private String annouceType;

    private String annouceMessage;

    @Lob
    @Column(name = "Annouce_Message")
    public String getAnnouceMessage() {
        return annouceMessage;
    }

    public void setAnnouceMessage(String annouceMessage) {
        this.annouceMessage = annouceMessage;
    }

    @Column(name = "Annouce_Type", nullable = false, length = 10)
    public String getAnnouceType() {
        return annouceType;
    }

    public void setAnnouceType(String annouceType) {
        this.annouceType = annouceType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}