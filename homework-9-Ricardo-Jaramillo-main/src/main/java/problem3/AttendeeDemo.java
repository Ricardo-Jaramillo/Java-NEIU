package problem3;

import java.util.ArrayList;
import java.util.Arrays;

public class AttendeeDemo {

    public static void main(String[] args) {
        // Uncomment lines 10 - 19
        Attendee a1 = new Attendee("Conner", "Lucy", 39203);
        Attendee a2 = new Attendee("Reid", "Nick", 9593);
        a2.setPaid(true);
        Attendee a3 = new Attendee("Nichols", "Valerie", 043223);
        Attendee a4 = new Attendee("Obrien", "Mae", 77483);
        a4.setPaid(true);

        Attendee[] attendees1 = { a1, a2, a3 };
        Attendee[] attendees2 = { a1, a2, a3 };
        Attendee[] attendees3 = { a2, a3, a4 };

        // Code for Problem 3, #3 goes here:
        System.out.println(Arrays.equals(attendees1, attendees2));
        System.out.println(Arrays.equals(attendees1, attendees3));
        Arrays.sort(attendees1);
        System.out.println(Arrays.toString(attendees1));
        System.out.println(Arrays.equals(attendees1,attendees2));

        // Code for Problem 3, #5 here
        ArrayList<Attendee> al = new ArrayList<>();
        al.add(a1);
        al.add(a2);
        al.add(a3);
        al.add(a4);

        System.out.println(Arrays.toString(al.toArray()));
        Attendee.removeNonPaid(al);
        System.out.println(Arrays.toString(al.toArray()));

    }
}
