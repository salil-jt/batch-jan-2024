package exceptions;

public class FinallyBlock {
public static void main(String[] args) {
	
	int balance = 100;
	
	int withdraw = 20;
	
	try {
		System.out.println("In try block");
	balance = balance + 100;	
	int calculate = balance/withdraw;
	System.out.println("Calculate: "+calculate);
	}
	catch(Exception e) {
		System.out.println("In catch block");
		
	}
	finally {//This will be executed always
		System.out.println("In finally");
	}
	
	System.out.println("Balance : "+balance);
	System.out.println("Withdraw : "+withdraw);
	System.out.println("End of program");
	System.out.println("In finally");
	
	
}
}
