package exceptions;

public class TryCatchBlock {
public static void main(String[] args) {
	
	
	int a = 10;
	int b = 2 ;
	int stud[]= new int[3];
	try {
		System.out.println("In try block");
	System.out.println(a/b);
	System.out.println(stud[4]);
	}
	catch(Exception ex) {
		System.out.println("In catch block");
		System.out.println("The value of b is 0, hence we cannot process");
		//ex.printStackTrace();
	}
	
	
	System.out.println("End of program");
	
}
}
