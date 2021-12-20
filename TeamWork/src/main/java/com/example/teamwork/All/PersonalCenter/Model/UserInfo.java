package com.example.teamwork.All.PersonalCenter.Model;

public class UserInfo {
    private String Unum;
    private String Loginaccountname;
    private String Upassword;
    private String Uname;
    private String Usex;
    private String Uphone;
    private String Uemail;
    private String Role;
    @Override
    public String toString() {
        return "UserInfo{" +
                "Unum='" + Unum + '\'' +
                ", Loginaccountname='" + Loginaccountname + '\'' +
                ", Upassword='" + Upassword + '\'' +
                ", Uname='" + Uname + '\'' +
                ", Usex='" + Usex + '\'' +
                ", Uphone='" + Uphone + '\'' +
                ", Uemail='" + Uemail + '\'' +
                ", Role='" + Role + '\'' +
                '}';
    }
    public String getUnum() {
        return Unum;
    }
    public void setUnum(String unum) {
        Unum = unum;
    }
    public String getRole() {
        return Role;
    }
    public void setRole(String role) {
        Role = role;
    }
    public String getLoginaccountname() {
        return Loginaccountname;
    }
    public void setLoginaccountname(String loginaccountname) {
        Loginaccountname = loginaccountname;
    }
    public String getUpassword() {
        return Upassword;
    }
    public void setUpassword(String upassword) {
        Upassword = upassword;
    }
    public String getUname() {
        return Uname;
    }
    public void setUname(String uname) {
        Uname = uname;
    }
    public String getUsex() {
        return Usex;
    }
    public void setUsex(String usex) {
        Usex = usex;
    }
    public String getUphone() {
        return Uphone;
    }
    public void setUphone(String uphone) {
        Uphone = uphone;
    }
    public String getUemail() {
        return Uemail;
    }
    public void setUemail(String uemail) {
        Uemail = uemail;
    }
    public UserInfo(){
        Unum="";
        Loginaccountname="";
        Upassword="";
        Uname="";
        Usex="";
        Uphone="";
        Uemail="";
        Role="";
    }
    public void SetUserInfo(UserInfo userInfo){
        this.Unum=Unum;
        this.Loginaccountname=Loginaccountname;
        this.Upassword=Upassword;
        this.Uname=Uname;
        this.Usex=Usex;
        this.Uphone=Uphone;
        this.Uemail=Uemail;
        this.Role=Role;
    }
}
