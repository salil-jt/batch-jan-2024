class Calculator{

double square(int i){// A parameter is a variable defined by a method that receives a value when the method is called.  i is a parameter

double res = i*i;

System.out.println(res);
return res;

}


void add(int a , int b){
	System.out.println("In add method with 2 params (a,b)");
	System.out.println(a+b);

}

/*Error - method add(int,int) is already defined in class Calculator
void add(int k , int j){
	System.out.println("In add method with 2 params (k,j)");
	System.out.println(k+j);

}
*/

void add(int a , int b,int c){
	System.out.println("In add method with 3 params");
	System.out.println(a+b+c);

}



}


class CalculatorDemo{

  public static void main(String args[]) {
  
  //calculate square of a number - 10
  
  Calculator c1 = new Calculator();
//  double res=c1.square(12); //An argument is a value that is passed to a method when it is invoked.  - 12 is an argument
  // System.out.println(c1.square(3));
  c1.add(2,5);
  c1.add(2,6,8);
  
  
}



}