package com.example.teamwork.All.ShowBook.Dao;

import com.example.teamwork.All.Model.BookInformation;
import com.example.teamwork.All.Utils.ToolHelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ShowBook implements ToolHelper {
    private BookInformation[]BnameList;
    private List<BookInformation> bl=new ArrayList<>() ;
    public int getCount(){
        int count=0;
        ResultSet rs;
        String sql="Select count(*) as totalCount from teamwork.booklist";
        try {
            Connection connection= ToolHelper.getConnect();
            Statement stmt=connection.createStatement();
            rs= stmt.executeQuery(sql);
            if(rs.next()){
                count=rs.getInt("totalCount");
            }
        }catch (Exception e){System.out.println(e);}
        return count;
    }
    public BookInformation[] GetArray(){
        BookInformation BookInformation=new BookInformation();
        ResultSet rs;
        int count=0;
        BnameList=new BookInformation[getCount()];
        String sql="Select * from teamwork.booklist";
        try {
            Connection connection= ToolHelper.getConnect();
            Statement stmt=connection.createStatement();
            rs=stmt.executeQuery(sql);
            while(rs.next()){
                BnameList[count]=new BookInformation();
                BookInformation.setBnum(rs.getString("Bnum"));
                BookInformation.setBname(rs.getString("Bname"));
                BookInformation.setBauthor(rs.getString("Bauthor"));
                BookInformation.setBpublichouse(rs.getString("Bpublichouse"));
                BookInformation.setBDetail(rs.getString("Bdetail"));
                BookInformation.setBorrowed(rs.getBoolean("IsBorrowed"));
                BnameList[count].SetBookInformation(BookInformation);
                count++;
                System.out.println(count);
            }
        }catch (Exception e){System.out.println(e);}
        return BnameList;
    }
    public List<BookInformation> GetList(){
        ResultSet rs;
        String sql="Select * from teamwork.booklist";
        try {
            Connection connection= ToolHelper.getConnect();
            Statement stmt=connection.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
            rs=stmt.executeQuery(sql);
            while(rs.next()){
                BookInformation BookInformation=new BookInformation();
                BookInformation.setBnum(rs.getString("Bnum"));
                BookInformation.setBname(rs.getString("Bname"));
                BookInformation.setBauthor(rs.getString("Bauthor"));
                BookInformation.setBpublichouse(rs.getString("Bpublichouse"));
                BookInformation.setBDetail(rs.getString("Bdetail"));
                BookInformation.setBorrowed(rs.getBoolean("IsBorrowed"));
                bl.add(BookInformation);
            }
        }catch (Exception e){System.out.println(e);}
        return bl;
    }

   public static void main(String[] args) {
        ShowBook showBookByBname=new ShowBook();
        System.out.println(showBookByBname.getCount());
        BookInformation bookInformation=new BookInformation();
        List<BookInformation> bookInformationList;
        bookInformationList=showBookByBname.GetList();
       System.out.println(bookInformationList.size());
       Object []res=bookInformationList.toArray();
       System.out.println(res.length);
       for (Object re : res) {
           System.out.println(re.toString());
       }
       BookInformation[] ba= showBookByBname.GetArray();
       for(BookInformation bb:ba){
           System.out.println(bb.toString());
       }
    }

}
