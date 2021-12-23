package com.example.teamwork.All.ShowBook.Dao;

import com.example.teamwork.All.Utils.ToolHelper;

import java.sql.Connection;
import java.sql.Statement;

public class  BorrowList implements ToolHelper {
    private String Unum,Bnum;
    public BorrowList(String unum, String bnum) {
        Unum = unum;
        Bnum = bnum;
    }
    public void Booking(){
        String sql="INSERT INTO `teamwork`.`borrowlist`" + "(`Booking_Num`,"+"`Unum`," + "`Bnum`," + "`Bookingtime`)" + "VALUES (" +'"' + ToolHelper.CreateTimeNum("num") + '"' + ',' + '"' + Unum + '"' + ',' + '"' + Bnum + '"' + ',' + '"' + ToolHelper.CreateTimeNum("Data") + '"' +')';
        try {
            Connection connection= ToolHelper.getConnect();
            Statement stmt=connection.createStatement();
            stmt.executeUpdate(sql);

        }catch (Exception e){System.out.println(e);}
    }

    /*public static void main(String[] args) {
        BorrowList bookingBook=new BorrowList("001","004");
        bookingBook.Booking();
    }*/
}
