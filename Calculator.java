class Calculator{

double square(int i){// A parameter is a variable defined by a method that receives a value when the method is called.  i is a parameter

double res = i*i;

System.out.println(res);
return res;

}



}


class CalculatorDemo{

  public static void main(String args[]) {
  
  //calculate square of a number - 10
  
  Calculator c1 = new Calculator();
  double res=c1.square(12); //An argument is a value that is passed to a method when it is invoked.  - 12 is an argument
   System.out.println(c1.square(3));
  
  
}



}