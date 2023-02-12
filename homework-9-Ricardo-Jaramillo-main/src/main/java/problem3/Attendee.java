package problem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Attendee implements Comparable<Attendee> {

    private final String lastName;
    private final String firstName;
    private final int id;
    private boolean paid;

    public Attendee(String lastName, String firstName, int id){
        if (lastName == null || firstName == null)
            throw new NullPointerException("Last name or first name cannot be null");
        else {
            this.lastName = lastName;
            this.firstName = firstName;
            this.id = id;
        }
    }

    public boolean isPaid(){
        return this.paid;
    }

    public void setPaid(boolean paid){
        this.paid = paid;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Attendee))
            return false;

        Attendee a = (Attendee) o;

        return this.lastName.equals(a.lastName) & this.firstName.equals(a.firstName) && this.id == a.id;
    }

    @Override
    public String toString(){
        return this.lastName + "-" + this.firstName + " Paid: " + this.paid;
    }

    @Override
    public int hashCode(){
        return this.id;
    }

    @Override
    public int compareTo(Attendee a){
        return this.lastName.compareTo(a.lastName);
    }

    public static void removeNonPaid(List<Attendee> initList){

        for (int i = 0; i < initList.size(); i++){
            Attendee a = initList.get(i);
            if (!a.paid){
                initList.remove(a);
                i--;
            }
        }
    }
}
