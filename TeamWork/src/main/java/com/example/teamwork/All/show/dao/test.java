package com.example.teamwork.All.show.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class test implements memberdao {
    public byte[] findbysno(String sno){
        String sql="select * from `teamwork`.`team`" + "WHERE SNO='" + sno + "';";
        try{
            Connection connection=getConnect();
            Statement stmt=connection.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            if(rs.first()){
                return rs.getBytes("photo");
            }
            return null;

        }catch (Exception e){
            System.out.println(e);
            return null;

        }

    }


}
