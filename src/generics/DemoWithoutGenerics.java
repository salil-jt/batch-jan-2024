package generics;

public class DemoWithoutGenerics {
public static void main(String[] args) {
	
	A obj = new A(10);
	
	//A obj1 = new A("Salil");////we cannot call the constructor because the type is int
	
	//A obj2 = new A(12.5); //we cannot call the constructor because the type is int
	
	
}
}

class A{
	
	int a;
	A(int a){
		this.a=a;
	}
	
}