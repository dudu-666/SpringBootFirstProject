package com.example.teamwork.All.PersonalCenter.Dao;

import com.example.teamwork.All.PersonalCenter.Model.UserInfo;
import com.example.teamwork.All.Utils.ToolHelper;

import javax.tools.Tool;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateUser {
    private UserInfo userInfo;
    public UpdateUser(UserInfo userInfo1){userInfo=userInfo1;}

    public Connection getConnect() throws ClassNotFoundException{
        return ToolHelper.getConnect();
    }
    public void Update(){
        String sql="UPDATE `teamwork`.`user` SET\n"+
                "`Unum`='"+userInfo.getUnum()+"',\n"+
                "`Upassword`='"+userInfo.getUpassword()+"',\n"+
                "`Uphone`='"+userInfo.getUphone()+"',\n"+
                "`Uemail`='"+userInfo.getUemail()+"',\n"+
                "`Uphone`='"+userInfo.getUphone()+"',\n"+
                "WHRER `Unum`='"+userInfo.getUnum()+"';";

        try{
            Connection connection=getConnect();
            Statement stmt=connection.createStatement();
            stmt.executeUpdate(sql);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
