package exceptions;

public class NestedTryBlock {
public static void main(String[] args) {
	
	
	int a = 10;
	int b=0;
	
	try {
		System.out.println("In try block 1");
		System.out.println(a/b);
		
		try {
			System.out.println("In try block 2");
		}
		catch(Exception e) {
			System.out.println("In catch block 2");
		}
		
		
	}
	catch(Exception e) {
		System.out.println("In catch block 1");
		try {
			System.out.println("In try block 3");
		}
		catch(Exception ex) {
			System.out.println("In catch block 3");
		}
	}
	
	
	
	
}
}
