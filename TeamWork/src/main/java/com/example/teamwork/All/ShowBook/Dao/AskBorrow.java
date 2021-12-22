package com.example.teamwork.All.ShowBook.Dao;

import com.example.teamwork.All.Utils.ToolHelper;

import java.sql.ResultSet;

public class AskBorrow {
    private String Bnum,Unum;
    public AskBorrow(String bnum, String unum) {
        Bnum = bnum;
        Unum = unum;
    }
    public String AskForBorrow(){
        String sql="select * from teamwork.borrowwaitlist where `Bnum`='"+Bnum+"'";
        try {
            ResultSet rs=ToolHelper.getConnect().createStatement().executeQuery(sql);
            if(!rs.first()){
                Do();
                return "Success";
            }
            else return "Fail";
        }catch (Exception e){System.out.println(e);return e.toString();}
    }
    private void Do(){
        String sql="INSERT INTO `teamwork`.`borrowwaitlist`\n" +
                "(`Bnum`," +
                "`Askingtime`," +
                "`Unum`) " +
                "VALUES" +
                "('"+Bnum+"'," +
                "'"+ToolHelper.CreateTimeNum("Date")+"'," +
                "'"+Unum+"')";
        try {
            System.out.println(sql);
            ToolHelper.getConnect().createStatement().executeUpdate(sql);
        }catch (Exception e){System.out.println(e);}
    }

    public static void main(String[] args) {
        System.out.println(new AskBorrow("001","001").AskForBorrow());
    }
}
