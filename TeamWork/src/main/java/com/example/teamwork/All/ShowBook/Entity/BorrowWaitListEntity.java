package com.example.teamwork.All.ShowBook.Entity;

import com.example.teamwork.All.login.Entity.UserEntity;

import javax.persistence.*;

@Entity(name = "BorrowWaitListEntity")
@Table(name = "borrow_wait_list")
public class BorrowWaitListEntity {
    @Id
    @Column(name = "Borrow_Wait_Book_Id", nullable = false, length = 20)
    private String id;
    @Column(name = "Borrow_Wait_Asking_Time", nullable = false, length = 30)
    private String borrowWaitAskingTime;
    @ManyToOne(optional = false)
    @JoinColumn(name = "Borrow_Wait_User_Id", nullable = false)
    private UserEntity borrowWaitUser;


    public UserEntity getBorrowWaitUser() {
        return borrowWaitUser;
    }

    public void setBorrowWaitUser(UserEntity borrowWaitUser) {
        this.borrowWaitUser = borrowWaitUser;
    }


    public String getBorrowWaitAskingTime() {
        return borrowWaitAskingTime;
    }

    public void setBorrowWaitAskingTime(String borrowWaitAskingTime) {
        this.borrowWaitAskingTime = borrowWaitAskingTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}