package classes_objects;
class Test_2 {
	int a;
	Test_2(int i) {
         a = i;
		}
       
    Test_2 incrByTen() {
    	Test_2 temp = new Test_2(a+10); //we are creating an object
         return temp;
		}
}

class RetOb {
  public static void main(String args[]) {
	  Test_2 ob1 = new Test_2(2);
    System.out.println(ob1.a);
    
   
    Test_2 ob2;
    ob2 = ob1.incrByTen();
    System.out.println("ob1.a: " + ob1.a); //2
    System.out.println("ob2.a: " + ob2.a); //12
    ob2 = ob2.incrByTen();
   System.out.println("ob2.a after second increase: "+ ob2.a);//22
   System.out.println("ob1.a: " + ob1.a);
   System.out.println("ob2.a: " + ob2.a);//22
   
   Test a[] = new Test[5];
   System.out.println(a.length);
} }

