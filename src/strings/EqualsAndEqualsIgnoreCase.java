package strings;

public class EqualsAndEqualsIgnoreCase {
public static void main(String[] args) {
	
	String s1 = "Hyderbad";
	String s2 = "Hyderbad";
	String s3 = "HyDerBad";
	
	System.out.println(s1.equals(s2)); //T
	System.out.println(s1.equals(s3)); //F
	System.out.println(s1.equalsIgnoreCase(s3));//T
	
	
	
}
}
