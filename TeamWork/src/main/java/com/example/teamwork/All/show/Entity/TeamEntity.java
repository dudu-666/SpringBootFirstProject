package com.example.teamwork.All.show.Entity;

import javax.persistence.*;

@Entity(name = "TeamEntity")
@Table(name = "team")
public class TeamEntity {
    @Id
    @Column(name = "User_Id", nullable = false, length = 10)
    private String id;

    private String userName;

    private String userGrade;

    private String userSex;

    private String userPrize;

    private byte[] userPhoto;

    @Column(name = "User_photo")
    public byte[] getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(byte[] userPhoto) {
        this.userPhoto = userPhoto;
    }

    @Column(name = "User_Prize", nullable = false, length = 100)
    public String getUserPrize() {
        return userPrize;
    }

    public void setUserPrize(String userPrize) {
        this.userPrize = userPrize;
    }

    @Column(name = "User_Sex", nullable = false, length = 4)
    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    @Lob
    @Column(name = "User_Grade", nullable = false)
    public String getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(String userGrade) {
        this.userGrade = userGrade;
    }

    @Column(name = "User_Name", nullable = false, length = 20)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}