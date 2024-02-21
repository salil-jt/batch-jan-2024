package inheritance;

public class CallOverriddenMethods {
public static void main(String[] args) {
	F a = new F();
    a.print();
    
    G b = new G();
    b.print();
    
    H c = new H();
    c.print();
    
    
    
    F objF = b;
    objF.print(); //
    
    
    objF = c;
    objF.print();
    
    //RunTimePolymorphism
    System.out.println("RunTimePolymorphism ");
    int input = 4;
    
    F aref;
    
    if(input < 10)
    {
        aref = new F();
    }
    else if(input < 30)
    {
        aref = new G();
    }
    else
    {
        aref = new H();
    }
    
    aref.print(); // LINE A
    
    
    
    F objF2 = new F();
    
   // H objH2 = objF2; // This is not allowed


}
}
class F
{
    void print()
    {
        System.out.println("Print method in class F called");
    }
}

class G extends F
{
    void print()
    {
        System.out.println("Print method in class G called");
    }
}

class H extends G
{
    void print()
    {
        System.out.println("Print method in class H called");
    }
}
