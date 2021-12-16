package com.example.teamwork.All.login.Dao;

import com.example.teamwork.All.Dao.ToolHelper;
import com.example.teamwork.All.login.Model.LoginModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserLoginDao implements ToolHelper {
    private String LoginAccountName;
    private String Password;
    public UserLoginDao(LoginModel loginModel) {
        this.Password = loginModel.getPassword();
        this.LoginAccountName = loginModel.getLoginAccountName();
    }
    public Boolean Login() throws SQLException,ClassNotFoundException {
        Connection connection = ToolHelper.getConnect();
        Statement stmt = connection.createStatement();
        String url = "Select *from teamwork.user where `loginaccountname` ="+"'"+LoginAccountName+"'";
        ResultSet rs = stmt.executeQuery(url);
        while (rs.next()) {
            String s2 = rs.getString("Upassword");
            if (Password.equals(s2)) {
                return true;
            }
        }
        return false;

    }

}
