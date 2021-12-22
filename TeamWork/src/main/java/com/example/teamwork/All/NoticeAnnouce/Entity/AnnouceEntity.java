package com.example.teamwork.All.NoticeAnnouce.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "AnnouceEntity")
@Table(name = "annouce")
public class AnnouceEntity {
    @Id
    @Column(name = "Annouce_Id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}