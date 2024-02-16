class Outer {
       int outer_x = 100;
       void test() {
        System.out.println("Outer x:"+outer_x);
       // System.out.println("Inner y:"+inner_y);
    	Inner inner = new Inner();
         inner.display();

       }
       
       
       class Inner {
        int inner_y = 50;
    		void display() {
     		 System.out.println("Inner class method: display: outer_x = " + outer_x);
    		}
		} 

 
} 


class InnerClassDemo {
  public static void main(String args[]) {
    Outer outer = new Outer();
    outer.test();

    
    Inner inner  = new Inner();
    inner.display();
  }
}
