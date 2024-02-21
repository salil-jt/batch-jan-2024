package abstract_classes;

public class AbstractClassesDemo {
public static void main(String[] args) {
	
//	Shape s1 = new Shape(); //You Cannot instantiate the type of an Abstract class
	
	Shape s2; //You can have a reference of the Shape class
	
	Rectangle r1 = new Rectangle(1,2);
	System.out.println(r1.getArea());
	
	
	
}
}



abstract class Shape{
	
    abstract double getArea(); 
	
	
	
}

 class Rectangle extends Shape{ ////Rectangle is a concrete class

	    double length;
	    double breadth;

	    Rectangle(double length, double breadth)
	    {
	        this.length = length;
	        this.breadth = breadth;
	    }

	 
	 double getArea()
	    {
	        return length * breadth;
	    }

	
	

}