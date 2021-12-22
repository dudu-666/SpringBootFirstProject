package com.example.teamwork.All.show.dao;

import com.example.teamwork.All.show.model.MemberInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class addmember implements memberdao {
    MemberInfo memberInfo;
    PreparedStatement ps=null;
    addmember(MemberInfo memberInfo){this.memberInfo=memberInfo;}
    public void add(){
        if(memberInfo!=null){
            try{

               // String sql="INSERT INTO `teamwork`.`team`" + "(`SNO`," +  "`SName`,"+ "`Sgrade`"+"`Ssex`"+"`SPrize`"+"`photo`)" + "VALUES" + "("+'"'+memberInfo.getSNO()+'"'+","+'"'+memberInfo.getSName()+'"'+","+'"'+memberInfo.getSgrade()+'"'+","+'"'+memberInfo.getSsex()+'"'+","+'"'+memberInfo.getSPrize()+'"'+","+memberInfo.getPhoto()+')';
                String sql="insert into team(SNO,SName,Sgrade,Ssex,SPrize,photo) values (?,?,?,?,?,?)";
                Connection connection=getConnect();
                ps=connection.prepareStatement(sql);
                ps.setString(1,memberInfo.getSNO());
                ps.setString(2,memberInfo.getSName());
                ps.setString(3,memberInfo.getSgrade());
                ps.setString(4,memberInfo.getSsex());
                ps.setString(5,memberInfo.getSPrize());
                ps.setBytes(6,memberInfo.getPhoto());
                ps.execute();
                System.out.println(sql);


            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
