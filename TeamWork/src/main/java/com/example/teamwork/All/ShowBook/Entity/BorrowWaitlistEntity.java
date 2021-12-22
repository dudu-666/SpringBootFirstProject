package com.example.teamwork.All.ShowBook.Entity;

import com.example.teamwork.All.login.Entity.UserEntity;

import javax.persistence.*;

@Entity(name = "BorrowWaitlistEntity")
@Table(name = "borrow_waitlist")
public class BorrowWaitlistEntity {
    @Id
    private String id;

    private String askingtime;

    private UserEntity unum;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Unum", nullable = false)
    public UserEntity getUnum() {
        return unum;
    }

    public void setUnum(UserEntity unum) {
        this.unum = unum;
    }

    @Column(name = "Askingtime", nullable = false, length = 30)
    public String getAskingtime() {
        return askingtime;
    }

    public void setAskingtime(String askingtime) {
        this.askingtime = askingtime;
    }
    @Column(name = "Bnum", nullable = false, length = 20)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}