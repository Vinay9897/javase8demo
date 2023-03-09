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

    public void displayTelepone() {
        for (int i = 0; i < telephoneNo.length; i++)
            System.out.print(telephoneNo[i] + " ");
        return;
    }
}

public class RegistrationTester {
    public static void main(String[] args) {
        Registration registration = new Registration("Kevin", "MN98971N", new long[] { 9452425421l,
                7676765252l });
        System.out.println(
                "Congratulations Kevin!!! you have been successfully registered for our services with the following details:");
        System.out.println("Customber Name :" + registration.customerName);
        System.out.println("Passport number:" + registration.getPassportNo());
        System.out.println("Phone numbers:" + registration.getTelephoneNo());
        Registration registration2 = new Registration("Kevin", 123, "PN7878", new long[] { 9452425421l,
                7676765252l });
        System.out.println(
                "Congratulations Kevin!!! you have been successfully registered for our services with the following details:");
        System.out.println("Customber Name :" + registration2.customerName);
        System.out.println("Passport number:" + registration2.getLicensenNo());
        System.out.println("Passport number:" + registration2.getPanCardNo());
        System.out.println("Phone numbers:" + registration2.getTelephoneNo());
    }
}
