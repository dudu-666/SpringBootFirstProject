package com.example.teamwork.All.ShowBook.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "BookListEntity")
@Table(name = "book_list")
public class BookListEntity {
    @Id
    @Column(name = "Book_Id", nullable = false, length = 20)
    private String id;

    private String bookName;

    private String bookAuthor;

    private String bookPublichouse;

    private String bookDetail;

    private String bookStatus;

    @Column(name = "Book_Status", nullable = false, length = 8)
    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Column(name = "Book_Detail", length = 100)
    public String getBookDetail() {
        return bookDetail;
    }

    public void setBookDetail(String bookDetail) {
        this.bookDetail = bookDetail;
    }

    @Column(name = "Book_Publichouse", nullable = false, length = 20)
    public String getBookPublichouse() {
        return bookPublichouse;
    }

    public void setBookPublichouse(String bookPublichouse) {
        this.bookPublichouse = bookPublichouse;
    }

    @Column(name = "Book_Author", nullable = false, length = 20)
    public String getBookAuthor() {
        return bookAuthor;
    }
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    @Column(name = "Book_Name", nullable = false, length = 20)
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