package exceptions;

public class MultipleCatchBlockInheritance {
public static void main(String[] args) {

	
	int a = 12;
	int b = 0;
	int stud[] = new int[3];
	stud[0]=1;stud[1]=2;stud[2]=3;
	
	try {
	System.out.println("In try block");
	System.out.println(a/b);
	System.out.println("After a/b ");
	System.out.println(stud[0]);
	System.out.println(stud[1]);
	System.out.println(stud[3]);
	System.out.println("After accessing array");
	}
	/*catch(Exception ex) {
		If this block is present here, the below 2 catch blocks are unreachable
	}*/
	catch(ArithmeticException ex) {
		System.out.println("In catch block of ArithmeticException");
	}
	catch(ArrayIndexOutOfBoundsException ex) {
		System.out.println("In catch block ArrayIndexOutOfBoundsException");
	}
	catch(Exception ex) {
		
	}
	System.out.println("End of program");
	

}
}
