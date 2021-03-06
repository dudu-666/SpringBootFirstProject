package com.example.teamwork.All.Model;
import java.nio.charset.StandardCharsets;
public class BookInformation {
    private String Bnum;
    private String Bname;
    private String Bauthor;
    private String Bpublichouse;
    private String BDetail;
    public boolean isBorrowed() {
        return Borrowed;
    }
    public void setBorrowed(boolean borrowed) {
        Borrowed = borrowed;
    }
    private boolean Borrowed =false;

    @Override
    public String toString() {
        return "BookInformation{" +
                "Bnum='" + Bnum + '\'' +
                ", Bname='" + Bname + '\'' +
                ", Bauthor='" + Bauthor + '\'' +
                ", Bpublichouse='" + Bpublichouse + '\'' +
                ", Detail='" + BDetail + '\'' +
                ", Borrowed=" + Borrowed +
                '}';
    }

    public BookInformation(){
        Bnum="";
        Bname="";
        Bauthor="";
        Bpublichouse="";
        BDetail="";
    };
    public void SetBookInformation(BookInformation bookInformation){
        this.Bnum=bookInformation.getBnum();
        this.Bname=bookInformation.getBname();
        this.Bauthor=bookInformation.getBauthor();
        this.Bpublichouse=bookInformation.getBpublichouse();
        this.BDetail=bookInformation.getBDetail();
    }
    public String getBnum() {
        return Bnum;
    }
    public void setBnum(String bnum) {
        Bnum = new String(bnum.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8);
    }
    public String getBname() {
        return Bname;
    }
    public void setBname(String bname) {
        Bname = new String(bname.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8);
    }
    public String getBauthor() {
        return Bauthor;
    }
    public void setBauthor(String bauthor){
        Bauthor = new String(bauthor.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8);
    }
    public String getBpublichouse() {
        return Bpublichouse;
    }
    public void setBpublichouse(String bpublichouse) {
        Bpublichouse = new String(bpublichouse.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8);
    }
    public String getBDetail() {
        return BDetail;
    }
    public void setBDetail(String detail) {
        BDetail = new String(detail.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8);
    }
}
