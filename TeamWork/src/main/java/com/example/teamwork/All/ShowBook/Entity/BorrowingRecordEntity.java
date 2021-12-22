package com.example.teamwork.All.ShowBook.Entity;
import com.example.teamwork.All.login.Entity.UserEntity;

import javax.persistence.*;

@Entity(name = "BorrowingRecordEntity")
@Table(name = "borrowing_records")
public class BorrowingRecordEntity {
    @Id
    private String id;

    private UserEntity user;

    private BookListEntity book;

    private String cordStarttime;

    private String bookStatus;

    @Column(name = "Book_Status", nullable = false, length = 8)
    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Column(name = "Cord_StartTime", nullable = false, length = 20)
    public String getCordStarttime() {
        return cordStarttime;
    }

    public void setCordStarttime(String cordStarttime) {
        this.cordStarttime = cordStarttime;
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
    @Column(name = "Cord_Id", nullable = false, length = 20)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}