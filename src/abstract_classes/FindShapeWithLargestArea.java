package abstract_classes;

public class FindShapeWithLargestArea {
public static void main(String[] args) {
	
	Shape1 shapes[] = new Shape1[5];
	
    shapes[0] = new Rectangle1(30.3, 45.4);	
    shapes[1] = new Circle(23.2);
    shapes[2] = new Triangle(146.2, 40.0);
    shapes[3] = new Rectangle1(25, 57.8);
    shapes[4] = new Triangle(120.0, 8.0);
    
    Shape1 largest = shapes[0];
    
    for(int i=0; i<shapes.length;i++) {
    	
    	if(shapes[i].getArea() > largest.getArea()) {
    		largest = shapes[i];
    	}
    	
    	
    }
    
    largest.printDetails();

	
}
}


abstract class Shape1
{
    abstract double getArea();

    abstract void printDetails();
}
class Rectangle1 extends Shape1
{
	
	double length;
    double breadth;

    Rectangle1(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }


	@Override
	double getArea() {
		return length * breadth;
	}

	@Override
	void printDetails() {
		System.out.println("Type = Rectangle1");
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Area = " + getArea());

	}
}


class Circle extends Shape1
{
    double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    double getArea()
    {
        return 3.14 * radius * radius;
    }

    void printDetails()
    {
        System.out.println("Type = Circle");
        System.out.println("Radius = " + radius);
        System.out.println("Area = " + getArea());
    }
}

class Triangle extends Shape1
{
    double base;
    double height;

    Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    double getArea()
    {
        return base * height / 2.0;
    }

    void printDetails()
    {
        System.out.println("Type = Triangle");
        System.out.println("Base = " + base);
        System.out.println("Height = " + height);
        System.out.println("Area = " + getArea());
    }
}
