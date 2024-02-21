package abstract_classes;

public class RulesAroundAbstract {

}

//Rule : 1
 abstract class A{
	
}
 
 abstract class B{
	abstract void m1(); //if a class has even one abstract method, then the class has to be an abstract class. 
}

 
//Rule : 2 •	An abstract class can have one or more abstract methods.
 abstract class C
 {
     abstract void method1();

     abstract double method2(int x, int y);

     abstract boolean method3(char z);
 }
 
 //Rule : 3 -	An abstract class can have both abstract and non abstract (or concrete) method.
 
 abstract class D
 {
     void method1()
     {
         System.out.println("I am a concrete method");
     }

     abstract double method2(int x, int y);

     int method3(double z)
     {
         System.out.println("I am also a concrete method");
 return 0;
     }

     abstract boolean method4(char z);
 }

// Rule 4:	The abstract method should not have method body. Even empty flower braces { } are not allowed.
 abstract class E
 {
     abstract void method1(); // Valid

   //  abstract void method2() {} // Invalid - since it has method body

 }
 
 //Rule 5:•	Any sub-class extending from an abstract class should either implement all the
 //abstract methods of the super-class or the sub-class itself should be marked as abstract.
 abstract class F{
	 abstract void method1(); 
 }
 
/* 
 * This won't work - We are not defining method1()

 class G extends F{
	
	 
 } */
 //If we are not defining the abstract method of super class then mark the class as abstract
 abstract class G extends F{
 }
 
 //Rule 6
 //	It is not necessary to add the abstract methods only in the super most class, we can add more abstract methods in the sub-classes.
 abstract class H
 {
     abstract void method1();
 }
 
 abstract class I extends H
 {
     abstract void method2();
 }

 class J extends I
 {

	@Override
	void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void method1() {
		// TODO Auto-generated method stub
		
	}
 }
 


 
 
 
 
 