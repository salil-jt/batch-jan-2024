package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
public static void main(String[] args) {
	Date date = new Date(); // LINE A
    System.out.println(date);
    
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
    String stringDate = dateFormat.format(date); // LINE C
    System.out.println(stringDate);


}
}
