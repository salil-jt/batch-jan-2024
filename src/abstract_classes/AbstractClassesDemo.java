package abstract_classes;

public class AbstractClassesDemo {
public static void main(String[] args) {
	
//	Shape s1 = new Shape(); //You Cannot instantiate the type of an Abstract class
	
	Shape s2; //You can have a reference of the Shape class
	
	Rectangle r1 = new Rectangle();
	
	s2 = r1;
	
}
}



abstract class Shape{
	
	
	
	
	
}

class Rectangle extends Shape{

}
