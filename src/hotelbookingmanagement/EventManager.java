package hotelbookingmanagement;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
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

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Guest [" + this.name + " , " + this.date + " , " + this.country + " , " + this.language + " , "
                + this.hobby + "]";
    }
}

public class EventManager {
    public static void main(String[] args) {
        Guest guest1 = new Guest("robert", LocalDate.now(), "USA", "English", "Eat");
        Guest guest2 = new Guest("albert", LocalDate.now().plusDays(3), "Spain", "Spanish", "Singing");
        Guest guest3 = new Guest("vinson", LocalDate.now().plusDays(6), "France", "French", "Playing");
        Guest guest4 = new Guest("romeyo", LocalDate.now().plusDays(9), "Russia", "Russian", "Reading");
        List<Guest> list = new ArrayList<>();
        list.add(guest1);
        list.add(guest2);
        list.add(guest3);
        list.add(guest4);
        List<String> countlist = new ArrayList<>();
        for (Guest g : list) {
            countlist.add(g.getCountry());
        }

        // convert list to stream
        Stream<String> gueststream = countlist.stream();
        System.out.println("*****Printing the stream*****");
        gueststream.forEach(System.out::println);
        gueststream.filter((val) -> "USA".equals(val)).collect(Collectors.toList())
                .forEach(gu -> System.out.println(gu));
        // lstGuest.stream().filter(pAmerican).forEach(guest ->
        // System.out.println(guest));
        // empStream_pipeline.filter(emp -> emp.getYearsInOrg() < 1)
        // .sorted((e1, e2) -> e1.getId() - e2.getId())
        // .forEach((e) -> System.out.println(e.getId() + ":" + e.getName()));
    }

    // public static void evaluate(List<String> countlist, Predicate<String>
    // predicate) {
    // for (String g : countlist) {
    // if (predicate.test(g))
    // return;
    // }
    // }
}
