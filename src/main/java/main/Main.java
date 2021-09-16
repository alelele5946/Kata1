package main;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        
        
        LocalDate birthdate = LocalDate.of(1980,1,1);
        Person person;
        person = new Person("Antoñio", birthdate);
        
        System.out.println(person.getName()+" tiene "+person.getAge()+ " años.");
        
    }
    
}
