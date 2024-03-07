package collection;

public class CheckInterfaces {
public static void main(String[] args) {
	CHello c = new CHello();
	c.m2();
}
}

class CHello implements IHello,IWelcome{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		IWelcome.super.m2();
		IHello.super.m2();
	}
	
}
interface IHello{
	
	void m1();
	
	default void m2() {
		System.out.println("In m2 of IHello");
	}
}

interface IWelcome{
	
	void m1();
	
	default void m2() {
		System.out.println("In m2 of IWelcome");
	}
}