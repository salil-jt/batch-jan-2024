  class ArithmeticOperators  {  
  
  
   public static void main(String []args) {
   
   int a = 10;
   int b = 3;
//   System.out.println(a%b); 
   
   //Post Increment ++
   
   int k = 10;
   k++; // k=k+1;
   System.out.println("K::"+k); //11
   
  
   int y = 9;
   System.out.println(y); //9
   int z = y++; //z=9 , y++=>y=y+1=10
   System.out.println("Z::" + z); // 9
   System.out.println("Y::" + y); // 10
   
   
   // Pre Increment
   
   int j = 5;
   System.out.println("J::"+ ++j);
   int d = ++j;
   System.out.println("D::"+ d); //7
   
   //example
   int x = 7;
   int w = 6;
   int p = ++x + w++;
   System.out.println("X: "+x); // 8
   System.out.println("W: "+w); // 7
   System.out.println("P: "+p); // 14
   
     
    //Operator Assigment 
    
    int h = 10;
    //h = h + 20;
     h += 20;
    System.out.println("H: "+h); 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     
     
   }
}
