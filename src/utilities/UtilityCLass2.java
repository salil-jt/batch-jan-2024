package utilities;

public class UtilityCLass2 {
public static void main(String[] args) {
	int num = 91;
	System.out.println(Math.sqrt(num));
	System.out.println("Converts to Positive Number : " + Math.abs(-7));
	
	Float b = 5.6f;
	System.out.println("Smallest integer greater than b : " + Math.ceil(b));
    System.out.println("Greatest integer less than b : " + Math.floor(b));
    
    System.out.println("Minimum of two numbers : " + Math.min(12.3, 9.6));
    System.out.println("Maximum of two numbers : " + Math.max(8, 6));

    
    Double degree = 30.0;
    System.out.println("sin(30) : " + Math.sin(30));
    System.out.println("sin(30) : " + Math.sin(Math.toRadians(degree)));
}
}
