package strings;

public class StringMethodsPart1 {
public static void main(String[] args) {
	
	String place = "Hyderabad";
	System.out.println("Length of string: "+ place.length());
	
	String welcome = "Welcome to Merit Campus";	
	
	System.out.println(welcome.charAt(3)); //c
	
	System.out.println("Print all characters of string in a new line");
	for(int i=0; i <welcome.length();i++) {
		System.out.println(welcome.charAt(i));
	}
	
	System.out.println(place.charAt(100));
}
}
