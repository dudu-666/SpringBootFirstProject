package All.show.dao;

import java.sql.Connection;
import java.sql.Statement;

public class deletemember implements memberdao{
    private String SNO;

    void DeleteStudent(String sno){
        this.SNO=sno;
    }

    public void Delete(String StudentId) {
        String sql = "DELETE FROM `teamwork`.`team`" + "WHERE SNO=" + SNO + ";";
        try {
            Connection connection = getConnect();
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        deletemember deletemember=new deletemember();
        deletemember.Delete("1904240001");


    }
}

