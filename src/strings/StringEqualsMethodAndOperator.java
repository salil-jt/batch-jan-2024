package strings;

public class StringEqualsMethodAndOperator {
public static void main(String[] args) {
	
    String s1 = new String("Tuesday");
	String s2 = new String("Tuesday");
	String s3 = "Tuesday";
	String s4 = "Tuesday";
	
	
	// == and equals

	System.out.println(s1==s2); //F
	System.out.println(s3==s4);//T
	System.out.println(s1.equals(s2));//t
	System.out.println(s3.equals(s4));//t
	System.out.println(s1.equals(s3));//t
	System.out.println(s1==s3);//f
	
	
	
}
}
