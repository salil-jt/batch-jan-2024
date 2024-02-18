package classes_objects;
class Rectangle_1
{
    double length;
    double breadth;

    Rectangle_1(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea()
    {
        return length * breadth;
    }

    double getPerimeter()
    {
        return 2 * (length + breadth);
    }
}

class FindRectangleArea
{
    public static void main(String arg[])
    {
    	Rectangle_1 rect = new Rectangle_1(10, 5);
        
        System.out.println("Length = " + rect.length);
        System.out.println("Breadth = " + rect.breadth);
        System.out.println("Area = " + rect.getArea());
        System.out.println("Perimeter = " + rect.getPerimeter());
    
    }
}
