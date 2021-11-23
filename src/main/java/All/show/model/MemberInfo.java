package All.show.model;

public class MemberInfo {
    private String SNO;
    private String SName;
    private String Sgrade;
    private String Ssex;

    public String getSPrize() {
        return SPrize;
    }

    public void setSPrize(String SPrize) {
        this.SPrize = SPrize;
    }

    private String SPrize;



    public String getSNO() {
        return SNO;
    }

    public void setSNO(String SNO) {
        this.SNO = SNO;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public String getSgrade() {
        return Sgrade;
    }

    public void setSgrade(String sgrade) {
        Sgrade = sgrade;
    }

    public String getSsex() {
        return Ssex;
    }

    public void setSsex(String ssex) {
        Ssex = ssex;
    }




    public MemberInfo(MemberInfo memberInfo)
    {
        this.SNO=memberInfo.getSNO();
        this.SName=memberInfo.getSName();
        this.Sgrade=memberInfo.getSgrade();
        this.Ssex=memberInfo.getSsex();
        this.SPrize=memberInfo.getSPrize();
    }

    public MemberInfo() {

    }
    public void Delete(){

    }


}
