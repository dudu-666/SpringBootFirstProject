package com.example.teamwork.All.ShowBook.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "BooklistEntity")
@Table(name = "booklist")
public class BooklistEntity {
    @Id
    @Column(name = "Bnum", nullable = false, length = 20)
    private String id;

    private String bookName;

    private String bookAuthor;

    private String bookPublichouse;

    private String bookDetail;

    private Integer bookStatus;

    @Column(name = "IsBorrowed", nullable = false)
    public Integer getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(Integer bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Column(name = "Bdetail", length = 100)
    public String getBookDetail() {
        return bookDetail;
    }

    public void setBookDetail(String bookDetail) {
        this.bookDetail = bookDetail;
    }

    @Column(name = "Bpublichouse", nullable = false, length = 20)
    public String getBookPublichouse() {
        return bookPublichouse;
    }

    public void setBookPublichouse(String bookPublichouse) {
        this.bookPublichouse = bookPublichouse;
    }

    @Column(name = "Bauthor", nullable = false, length = 20)
    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    @Column(name = "Bname", nullable = false, length = 20)
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}