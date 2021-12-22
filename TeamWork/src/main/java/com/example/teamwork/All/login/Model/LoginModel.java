package com.example.teamwork.All.login.Model;

public class LoginModel {
    private String LoginName;
    private String Password;

    public String getLoginAccountName() {
        return LoginName;
    }

    public void setLoginAccountName(String loginAccountName) {
        LoginName = loginAccountName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String upassword) {
        this.Password = upassword;
    }
}
