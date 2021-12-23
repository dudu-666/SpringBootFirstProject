package com.example.teamwork.All.ShowBook.Entity;

import com.example.teamwork.All.login.Entity.UserEntity;

import javax.persistence.*;

@Entity(name = "BorrowingRecordEntity")
@Table(name = "borrowing_records")
public class BorrowingRecordEntity {
    @Id
    @Column(name = "Cord_Id", nullable = false, length = 20)
    private String id;
    @ManyToOne(optional = false)
    @JoinColumn(name = "User_Id", nullable = false)
    private UserEntity user;
    @ManyToOne(optional = false)
    @JoinColumn(name = "Book_Id", nullable = false)
    private BookListEntity book;
    @Column(name = "Cord_StartTime", nullable = false, length = 20)
    private String cordStarttime;
    @Column(name = "Book_Status", nullable = false, length = 8)
    private String bookStatus;
    public String getBookStatus() {
        return bookStatus;
    }
    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }
    public String getCordStarttime() {
        return cordStarttime;
    }
    public void setCordStarttime(String cordStarttime) {
        this.cordStarttime = cordStarttime;
    }
    public BookListEntity getBook() {
        return book;
    }
    public void setBook(BookListEntity book) {
        this.book = book;
    }
    public UserEntity getUser() {
        return user;
    }
    public void setUser(UserEntity user) {
        this.user = user;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}