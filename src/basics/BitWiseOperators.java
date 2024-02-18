package basics;
class BitWiseOperators  {  
  
  
   public static void main(String []args) {
   
   	int a = 5;
   	System.out.println(~a);
   
   int b = 10;
   int c = 5;
   System.out.println("output &:"+ (b&c));
   System.out.println("output |:"+ (b|c));
   System.out.println("output ^:"+ (b^c));
   
   System.out.println("Right Shift:"+ (b>>1));
   System.out.println("Right Shift:"+ (27>>1));
   System.out.println("Right Shift:"+ (27>>2));
   System.out.println("Left Shift:"+ (b<<1));
   System.out.println("Left Shift:"+ (b<<2));
   //Negative numbers
   System.out.println("Left Shift:"+ (-10<<1));
   
   System.out.println("Negative Right Shift:"+ (-8>>1));
   
   // >>>
 //  -8
   //11111111111111111111111111111000
    System.out.println("Negative Right Shift:"+ (-8>>>1));
   
   }
   
   } 