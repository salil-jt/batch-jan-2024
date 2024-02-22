package interfaces;

public class InterfacesRulesWhileUsing {

	public static void main(String[] args) {
		Rule3 obj = new Rule3();
		obj.methodA();
	}
	
}

//Rule : 1- When class  implements an interface, then it has to implement all the methods in the interface.
interface IA
{
    void method1();
    
    int method2(int x, int y);
}
class A implements IA
{
    public void method1()
    {
        // Some code here
    }

    public int method2(int x, int y)
    {
        // Some code here
    	return 0;
    }
}

//Rule 2:	An interface extending other interface
interface IAA
{
    void method1();
    
    int method2(int x, int y);
}
interface IB extends IAA
{
    double method3();
}
class B implements IB{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int method2(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double method3() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
//Rule 3: An interface extending multiple interfaces
interface IA3
{
    void methodA();
}
interface IB3
{
	void methodA();
	void methodB();
}
interface IC3
{
    void methodC();
}
interface ID3 extends IA3, IB3, IC3
{
    void methodD();
}

class Rule3 implements ID3{

	@Override
	public void methodA() {
		System.out.println("In methodA");
		
	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodC() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodD() {
		// TODO Auto-generated method stub
		
	}
	
}



//Rule  4: •	An interface can have constant (public static final) variables. In fact, 

interface IAVariable
{
    public static final double PI = 3.14;
    double PI_2 = 3.14;
    static double PI_3 = 3.14;
	
}

