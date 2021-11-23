package All.show.dao;

import All.show.model.MemberInfo;

import java.sql.Connection;
import java.sql.Statement;

public class addmember implements memberdao {
    MemberInfo memberInfo;
    addmember(MemberInfo memberInfo){this.memberInfo=memberInfo;}
    public void add(){
        if(memberInfo!=null){
            try{
                String sql="INSERT INTO `teamwork`.`team`" + "(`SNO`," +  "`SName`,"+ "`Sgrade`"+"`Ssex`"+"`SPrize`)" + "VALUES" + "("+'"'+memberInfo.getSNO()+'"'+","+'"'+memberInfo.getSName()+'"'+","+'"'+memberInfo.getSgrade()+'"'+","+'"'+memberInfo.getSsex()+'"'+","+'"'+memberInfo.getSPrize()+'"'+')';
                Connection connection=getConnect();
                System.out.println(sql);
                Statement stmt=connection.createStatement();
                stmt.executeUpdate(sql);


            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args){
        MemberInfo memberInfo=new MemberInfo();
        memberInfo.setSNO("");
        memberInfo.setSName("");
        memberInfo.setSgrade("");
        memberInfo.setSsex("");
        memberInfo.setSPrize("");
        addmember addmember=new addmember(memberInfo);
        addmember.add();


    }





}
