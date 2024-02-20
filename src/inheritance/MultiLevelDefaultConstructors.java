package inheritance;

public class MultiLevelDefaultConstructors {
public static void main(String[] args) {
	
	X objX = new X(); //Created A
	Y objY = new Y(); //Created A Created B
	
}
}
class X
{
	
	
    X()    // LINE A
    {
        System.out.println("Created A");
    }
}

class Y extends X
{
    Y()
    {
        System.out.println("Created B");
    }
}

class Z extends Y
{
    Z()
    {
        System.out.println("Created C");
    }
}
