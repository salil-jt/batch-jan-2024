package exceptions;

public class SomeExceptionsInJava {
public static void main(String[] args) {
	
	int a = 10;
	int b = 0;
	int c=0;
	//if(b == 0) {
		System.out.println("b is 0, cannot divide");
	//}
	//else {
	 c = a/b; //java.lang.ArithmeticException:/ divide by zero
	System.out.println("Value of c is : "+c);
	//}
	
	int d = c * 2 + 8;
	System.out.println("Value of d is : "+d);
	
	
	int stud[] = new int[3];
	stud[0]=1;stud[1]=2;stud[2]=3;
	System.out.println(stud[0]);
	System.out.println(stud[1]);
	System.out.println(stud[2]);
	System.out.println(stud[3]); //java.lang.ArrayIndexOutOfBoundsException
	
}
}
