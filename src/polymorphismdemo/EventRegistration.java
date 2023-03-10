package polymorphismdemo;

public class EventRegistration {
    String name;
    String nameOfEvent;
    double registrationFee;

    public EventRegistration(String name, String nameOfEvent) {
        this.name = name;
        this.nameOfEvent = nameOfEvent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfEvent() {
        return nameOfEvent;
    }

    public void setNameOfEvent(String nameOfEvent) {
        this.nameOfEvent = nameOfEvent;
    }

    public double getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(double registrationFee) {
        this.registrationFee = registrationFee;
    }

    public void registerEvent(String events, int baseFee) {
        // displays the registration fee based on the event for which
        // the participant is going to register.
        System.out.println("Thank You " + name + " for your participation.Your registration fee is:" + registrationFee);
    }
}
