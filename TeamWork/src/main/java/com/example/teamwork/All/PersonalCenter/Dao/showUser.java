package com.example.teamwork.All.PersonalCenter.Dao;

import com.example.teamwork.All.PersonalCenter.Model.UserInfo;
import com.example.teamwork.All.Utils.ToolHelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class showUser {
    private UserInfo[]UserList;
    private List<UserInfo> ul=new ArrayList<>();
    public int GetCount(){
        int count=0;
        ResultSet rs;
        String sql="select count(*) as totalCount from teamwok.user";
        try{
            Connection connection= ToolHelper.getConnect();
            Statement stmt=connection.createStatement();
            rs=stmt.executeQuery(sql);
            if(rs.next()){
                count= rs.getInt("totalcount");
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return count;
    }
    public List<UserInfo>Getlist(){
        ResultSet rs;
        String sql="select * from teamwork.user";
        try {
            Connection connection= ToolHelper.getConnect();
            Statement stmt=connection.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE);
            rs=stmt.executeQuery(sql);
            while(rs.next()){
                UserInfo userInfo=new UserInfo();
                userInfo.setUnum(rs.getString("Unum"));
                userInfo.setLoginaccountname(rs.getString("Loginaccountname"));
                userInfo.setUpassword(rs.getString("Upassword"));
                userInfo.setUname(rs.getString("Uname"));
                userInfo.setUsex(rs.getString("Usex"));
                userInfo.setUphone(rs.getString("Uphone"));
                userInfo.setUemail(rs.getString("Uemail"));
                userInfo.setRole(rs.getString("Role"));
                ul.add(userInfo);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return ul;

    }







}
