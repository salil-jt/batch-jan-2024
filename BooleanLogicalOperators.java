public class BooleanLogicalOperators {
   public static void main(String []args) {
   
	int a = 10;
	int b = 20;
	System.out.println(a&b);
	
	boolean voterAgeGreaterThan18 = true;
	boolean voterResidentOfIndia = false;
    System.out.println(voterAgeGreaterThan18 & voterResidentOfIndia);
    System.out.println(voterAgeGreaterThan18 | voterResidentOfIndia);
    System.out.println(voterAgeGreaterThan18 ^ voterResidentOfIndia);
    
    int c = 2;
    int e = 99;
    int d = 0;
    System.out.println(c==1 & e++==99); // false
    System.out.println(e); //100
    
    
    
    
    //Short circuit operators
    System.out.println("Short circuit operator");
    int i = 2;
    int j = 99;
    int k = 0;
    System.out.println(i==1 && j++==99); // false
    System.out.println(j); //99
    
    
    //! operator
    boolean result = false;
    System.out.println("Result:"+!result);
    
    //
    boolean result_1 = true;
   System.out.println("Result:"+ (result == result_1));
   
   }
   }
