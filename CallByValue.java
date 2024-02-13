class Test {
  void meth(int i, int j) { //Pass by value
    	i *= 2;
		j /= 2; 
		System.out.println("i and j before call: " +
                       i + " " + j);
	}
}

class TestCBR{

int a, b;
  TestCBR(int i, int j) {
    		a = i;
			b = j; 
	}
  // pass an object
  void meth(TestCBR o) {
  /* If we assign the object value to primitive and then do any calculations, the object instane variables are not impacted.
  	int a = o.a;
  	int b = o.b;
  	a *= 2;
  	b /= 2;
      System.out.println("ob.a and ob.b after call: " +
                            a + " " + b);
*/                            
		o.a *= 2;
		o.b /= 2; 
	}


}


class CallByValue {
  public static void main(String args[]) {
    /*
    Test ob = new Test();
    int a = 15, b = 20;
    System.out.println("a and b before call: " +
                       a + " " + b);
    ob.meth(a, b);
    System.out.println("a and b after call: " +
                       a + " " + b);
                       */
    TestCBR ob = new TestCBR(15, 20);
    System.out.println("ob.a and ob.b before call: " +
                            ob.a + " " + ob.b);
   ob.meth(ob);
    System.out.println("ob.a and ob.b after call: " +
                            ob.a + " " + ob.b);
 
                       
                    
} }

