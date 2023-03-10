package polymorphismdemo;

public class SingleEventRegistration extends TeamEventRegistration {
    public SingleEventRegistration(String name, String nameOfEvent, int noOfParticipants) {
        super(nameOfEvent, nameOfEvent, noOfParticipants, noOfParticipants);
        this.name = name;
        this.nameOfEvent = nameOfEvent;
        this.noOfParticipants = noOfParticipants;
    }

    int participantNo;

    public int getParticipantNo() {
        return participantNo;
    }

    public void setParticipantNo(int participantNo) {
        this.participantNo = participantNo;
    }

    @Override
    public void registerEvent(String events, int baseFee) {
        registrationFee = baseFee * noOfParticipants;
        System.out.println("Thank You " + name + " for your participation.Your registration fee is:" + registrationFee);
        System.out.println("You are participant no:" + noOfParticipants);
    }
}
