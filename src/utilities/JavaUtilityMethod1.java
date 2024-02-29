package utilities;

public class JavaUtilityMethod1 {
public static void main(String[] args) {
	int sum=0;
	long t1 = System.currentTimeMillis(); //epoch time
	System.out.println(t1);
	for(int i=0;i<2000;i++) {
		
		for(int j=0;j<200;j++) {
			sum=sum+i;
		}
	}
	System.out.println("Sum is:"+sum);
	
	long t2 = System.currentTimeMillis();
	
	System.out.println("Program ran for: "+ (t2-t1));
	
}
}
