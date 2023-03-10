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
    public void registerEvent() {
        // TODO Auto-generated method stub
        super.registerEvent();
    }
}
