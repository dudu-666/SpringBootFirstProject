package com.example.teamwork.All.ShowBook.Entity;

import com.example.teamwork.All.login.Entity.UserEntity;

import javax.persistence.*;

@Entity(name = "BorrowListEntity")
@Table(name = "borrow_list")
public class BorrowListEntity {
    @Id
    private String id;

    private UserEntity user;

    private BookListEntity book;

    private String borrowStarttime;

    @Column(name = "Borrow_StartTime", nullable = false, length = 30)
    public String getBorrowStarttime() {
        return borrowStarttime;
    }

    public void setBorrowStarttime(String borrowStarttime) {
        this.borrowStarttime = borrowStarttime;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "Book_Id", nullable = false)
    public BookListEntity getBook() {
        return book;
    }

    public void setBook(BookListEntity book) {
        this.book = book;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "User_Id", nullable = false)
    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
    @Column(name = "Booking_Num", nullable = false, length = 20)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}