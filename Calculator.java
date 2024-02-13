class Calculator{


void add(int a , int b){
	System.out.println("In add method with 2 params (a,b) - (int,int)");
	System.out.println(a+b);
}

/*Error - method add(int,int) is already defined in class Calculator
int add(int a , int b){
	System.out.println("In add method with 2 params (a,b) - (int,int) with return type");
	System.out.println(a+b);
	return a+b;
}
*/


void add(double a , double b){
	System.out.println("In add method with 2 params (a,b) - (double, double)");
	System.out.println(a+b);

}

void add(double a , int b){
	System.out.println("In add method with 2 params (a,b) - (int, double)");
	System.out.println(a+b);

}

/*Error - method add(int,int) is already defined in class Calculator
void add(int k , int j){
	System.out.println("In add method with 2 params (k,j)");
	System.out.println(k+j);

}
*/
}


class CalculatorDemo{

  public static void main(String args[]) {
  
  //calculate square of a number - 10
  
  Calculator c1 = new Calculator();
//  double res=c1.square(12); //An argument is a value that is passed to a method when it is invoked.  - 12 is an argument
  // System.out.println(c1.square(3));
  c1.add(2,5);
  c1.add(2.0,5.0);
  c1.add(2.0,5);
  c1.add(1,5.0);
 // c1.add(2,6,8);

  
  
}



}