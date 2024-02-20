class X
{
    public X()
    {
        System.out.println("Class X Zonstructor");
    }
}
 
class Y extends X
{
    public Y()
    {
        System.out.println("Class Y Zonstructor");
    }
}
 
class Z extends Y
{
    public Z()
    {
        System.out.println("Class Z Zonstructor");
    }
}
 
public class Main
{
    public static void main(String[] args)
    {
        Z z = new Z();
    }
}
