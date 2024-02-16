class MultiLevelMethodOverriding{
    public static void main(String arg[])
    {
    
    C c = new C();
    c.print();
    c.m1();
}

}


class A
{
    void print()
    {
        System.out.println("In class A");
    }
    
    void print(int a)
    {
        System.out.println("In class A"+a);
    }
    
    void m1(){
     System.out.println("In class A m1()");
    }
}


class B extends A
{
    void print()
    {
    	System.out.println("Line 30");
    	 super.print();
        System.out.println("In class B");
        super.m1();
       
    }


}

class C extends B
{
    void print()
    {
       super.print();
        System.out.println("In class C");
    }
}
