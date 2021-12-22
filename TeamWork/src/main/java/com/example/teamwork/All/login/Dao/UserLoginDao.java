package com.example.teamwork.All.login.Dao;

import com.example.teamwork.All.Utils.ToolHelper;
import com.example.teamwork.All.login.Model.LoginModel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserLoginDao implements ToolHelper {
    private String LoginName;
    private String Password;
    public UserLoginDao(LoginModel loginModel) {
        this.Password = loginModel.getPassword();
        this.LoginName = loginModel.getLoginAccountName();
    }
    public Boolean Login() throws SQLException,ClassNotFoundException {
        Statement stmt = ToolHelper.getConnect().createStatement();
        String url = "Select *from teamwork.user where `User_LoginName` ="+"'"+LoginName+"'";
        ResultSet rs = stmt.executeQuery(url);
        while (rs.next()) {
            String s2 = rs.getString("User_PassWord");
            System.out.println(s2);
            if (Password.equals(s2)) {
                return true;
            }
        }
        return false;

    }

}
