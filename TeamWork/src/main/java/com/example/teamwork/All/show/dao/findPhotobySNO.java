package com.example.teamwork.All.show.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class findPhotobySNO implements memberdao {
    public byte[] findBySNO(String sno){
        String sql="select * from `teamwork`.`team`" + "WHERE SNO='" + sno + "';";
        try {
            System.out.println(sql);
            Connection connection = getConnect();
            Statement stmt = connection.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
///          memberInfo.setPhoto();
            if (rs.first())
                return rs.getBytes("photo");
            return null;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

    }


    public static void main(String[] args){
        findPhotobySNO f=new findPhotobySNO();
        System.out.println(f.findBySNO("1234567899"));

    }
}
