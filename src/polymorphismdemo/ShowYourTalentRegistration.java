package polymorphismdemo;

public class ShowYourTalentRegistration {
    public static void main(String[] args) {
        int baseFee = 50;

        EventRegistration participat1 = new SingleEventRegistration("Jenny", "Sing&Win", 1);
        participat1.registerEvent("ShakeALeg", 100);

        System.out.println("*******************");
        EventRegistration team1 = new TeamEventRegistration("Aura", "ShakeALeg", 1, 5);
        team1.registerEvent("ShakeALeg", 50);
        System.out.println("*******************");
        EventRegistration participant2 = new SingleEventRegistration("Hudson", "PlayAway", 2);
        participant2.registerEvent("PlayAway", 130);
    }
}
