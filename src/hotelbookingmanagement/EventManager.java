package hotelbookingmanagement;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

class Guest {
    String name;
    LocalDate date = LocalDate.now();
    String country;
    String language;
    String hobby;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // constructor
    public Guest(String name, LocalDate date, String country, String language, String hobby) {
        this.name = name;
        this.date = date;
        this.country = country;
        this.language = language;
        this.hobby = hobby;
    }
}

public class EventManager {
    public static void main(String[] args) {
        Guest guest1 = new Guest("robert", LocalDate.now(), "USA", "English", "Eat");
        Guest guest2 = new Guest("albert", LocalDate.now(), "Spain", "Spanish", "Singing");
        Guest guest3 = new Guest("vinson", LocalDate.now(), "France", "French", "Playing");
        Guest guest4 = new Guest("romeyo", LocalDate.now(), "Russia", "Russian", "Reading");
        List<Guest> list = new ArrayList<>();
        list.add(guest1);
        list.add(guest2);
        list.add(guest3);
        list.add(guest4);
    }
}
