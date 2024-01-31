public class OperatorPrecedence {
   public static void main(String []args) {
   
   int value = 1 + 2 * 3 * 3 + 1;
   System.out.println(value);
  
   
   
   
   // Try evaluating the differnt expressions with different operators and see why we are getting the output a certain way
   
   int a = 10;
   int b = 30;
   int c = 5;
   int d = 5;
   
   int result = a * b++ / (c + d);
   			//  10 * 30 / 10
   			// 
   			
   		System.out.println(result);	 //68
   		System.out.println(b);	//31
   
   
   
   }
   }
