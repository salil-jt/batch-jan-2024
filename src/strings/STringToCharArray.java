package strings;

public class STringToCharArray {
public static void main(String[] args) {
	
	String place = "Hyderabad";
	System.out.println(place.length());
	
	char lettersOfPlace[] = place.toCharArray();
	
	for(int i=0;i<lettersOfPlace.length;i++) {
		System.out.println(lettersOfPlace[i]);
	}
	
	
}
}
