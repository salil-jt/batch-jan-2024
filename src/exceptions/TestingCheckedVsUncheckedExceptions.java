package exceptions;

public class TestingCheckedVsUncheckedExceptions {
	
	public static void main(String[] args) {
		Test test =new Test();
		
		
//		try {
//			test.method1();
//		} catch (CheckedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		test.method2();
		
		
	}

}

class CheckedException extends Exception
{
}

class UncheckedException extends RuntimeException
{
}

class Test{
	
	
	void method1() throws CheckedException
    {
    System.out.println("In method1 which throws a CheckedException");
    }

	void method2() throws UncheckedException
    {
		 System.out.println("In method2 which throws a UncheckedException");
		 
		 
    }

	
}

