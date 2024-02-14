class Fibonacci {
       // this is a recursive method
       int fibonacci(int n) {
      // System.out.println("In fibonaaci series");
         if(n==2)  return 1;
         if(n==1)  return 0;
         
         
return fibonacci(n-1)+fibonacci(n-2);
         
         }
    }
class RecursionFibonacci {
  public static void main(String args[]) {
    Fibonacci f = new Fibonacci();
  	System.out.println("fibonacci of 3 is " + f.fibonacci(3));
   System.out.println("fibonacci of 7 is " + f.fibonacci(7));
    //System.out.println("Factorial of 5 is " + f.fibonacci(5));
    int input = 15;
    System.out.println("Fibonacci series upto the :"+input );
    for(int i=1;i<=input;i++){
    
    System.out.println(f.fibonacci(i));
    }
    
    
    
} }
