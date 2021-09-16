package main;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final Calendar birthdate;
    private final long Milliseconds_per_Year = (long) (365.25*24*60*60*1000L)
    public Person(String name, Calendar birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }
    
    int getAge(){
        Calendar now = GregorianCalendar.getInstance();
        retrun 
        
    
    }
    
    
    
    
    
}
