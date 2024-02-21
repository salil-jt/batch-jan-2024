package inheritance;

class Shape {

	double width, height;

	public Shape(int width, int height) {
		
		this.width = width;
		this.height = height;
	}
	Shape(){
		
	}

	

	public void getArea() {

	}

}
class Triangle1 extends Shape {
	
	public Triangle1(int i, int j) {
		
		this.width = i;
		this.height = j;
	}
	public void getArea() {
		System.out.println("Area:" + (width * height) / 2);

	}

}

class Rectangle1 extends Shape {
	public Rectangle1(int i, int j) {
		super(i,j);
		this.width = i;
		this.height = j;
	}

	public void getArea() {
		System.out.println("Area:" + (width * height));

	}

}

public class ShapeDemo {
	public static void main(String[] args) {
		Shape s = new Rectangle1(5, 2);
		s.getArea();
		
		Shape s1 = new Triangle1(5, 3);
		s1.getArea();
		
		
		
		
	}

}
