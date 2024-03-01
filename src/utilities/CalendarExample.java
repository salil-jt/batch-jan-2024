package utilities;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class CalendarExample {
public static void main(String[] args) {
	String months[] = {"JAN", "FEB", "MAR", "APR", "MAY", "JUNE", "JULY", "AUG", "SEPT", "OCT", "NOV", "DEC"};
    Calendar cal = Calendar.getInstance();
    
    //Display current time and date information.
    System.out.println("Date :"+cal);
    System.out.print(months[cal.get(java.util.Calendar.MONTH)]);
    System.out.print(" " + cal.get(Calendar.DATE) + " ");// 1
    System.out.println(cal.get(Calendar.YEAR));//2024
    
    System.out.println("Current Time: "); // LINE A
    System.out.print(cal.get(Calendar.HOUR) + ":");
    System.out.print(cal.get(Calendar.MINUTE) + ":");
    System.out.println("-----Locale----");
    Calendar now = Calendar.getInstance(); 
    TimeZone timeZone = TimeZone.getTimeZone("IST"); 
    System.out.println(timeZone.getDisplayName()); 
    timeZone = TimeZone.getTimeZone("CST");
    System.out.println("Before: "+now);
    now = Calendar.getInstance(timeZone);
    System.out.println(timeZone.getDisplayName());
    System.out.println("After: "+now);
    
    Locale l = Locale.getDefault(); // LINE A
    System.out.println(l); 
    System.out.println(l.getDisplayCountry()); // LINE B
    System.out.println(l.getCountry()); // LINE C
    System.out.println(l.getDisplayLanguage()); // LINE D
    System.out.println(l.getLanguage());


}
}
