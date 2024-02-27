package exceptions;

public class ErrorExample {
	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		m2();
		
	}
	private static void m2() {
		m1();
		
	}

}
