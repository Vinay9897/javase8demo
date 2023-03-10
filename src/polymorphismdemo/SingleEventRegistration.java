package polymorphismdemo;

public class SingleEventRegistration extends EventRegistration {
    int participantNo;

    public SingleEventRegistration(String name, String nameOfEvent, int participantNo) {
        super(name, nameOfEvent);
        this.name = name;
        this.nameOfEvent = nameOfEvent;
        this.participantNo = participantNo;
    }

    public int getParticipantNo() {
        return participantNo;
    }

    public void setParticipantNo(int participantNo) {
        this.participantNo = participantNo;
    }

    @Override
    public void registerEvent(String events, int baseFee) {
        registrationFee = baseFee * participantNo;
        System.out.println("Event name is " + events);
        // System.out.println("Team Number is " + );
        System.out.println("Registration Fee for SingleEvent : " + registrationFee);
    }
}
