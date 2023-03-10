package polymorphismdemo;

public class TeamEventRegistration extends EventRegistration {
    int noOfParticipants;
    int teamNo;

    public TeamEventRegistration(String name, String nameOfEvent, int teamNo, int noOfParticipants) {
        super(name, nameOfEvent);
        this.teamNo = teamNo;
        this.noOfParticipants = noOfParticipants;
    }

    public int getNoOfParticipants() {
        return noOfParticipants;
    }

    public void setNoOfParticipants(int noOfParticipants) {
        this.noOfParticipants = noOfParticipants;
    }

    public int getTeamNo() {
        return teamNo;
    }

    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
    }

    public void registerFee(String Events, int baseFee) {
        registrationFee = baseFee * noOfParticipants;
        System.out.println("Thank You " + name + " for your participation.Your registration fee is:" + registrationFee);
        System.out.println("You are participant no:" + noOfParticipants);
    }

}
