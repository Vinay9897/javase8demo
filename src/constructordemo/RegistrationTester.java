package constructordemo;

class Registration {
    String customerName;
    String panCardNo;
    int voterid;
    String passportNo;
    int licensenNo;
    long[] telephoneNo;

    public Registration(String customerName, String passportNo, long[] telephoneNo) {
        this.customerName = customerName;
        this.passportNo = passportNo;
        this.telephoneNo = telephoneNo;
    }

    public Registration(String customerName, int licensenNo, String panCardNo, long[] telephoneNo) {
        this.customerName = customerName;
        this.licensenNo = licensenNo;
        this.panCardNo = panCardNo;
        this.telephoneNo = telephoneNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPanCardNo() {
        return panCardNo;
    }

    public void setPanCardNo(String panCardNo) {
        this.panCardNo = panCardNo;
    }

    public int getVoterid() {
        return voterid;
    }

    public void setVoterid(int voterid) {
        this.voterid = voterid;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public int getLicensenNo() {
        return licensenNo;
    }

    public void setLicensenNo(int licensenNo) {
        this.licensenNo = licensenNo;
    }

    public long[] getTelephoneNo() {
        return telephoneNo;
    }
}

public class RegistrationTester {

}
