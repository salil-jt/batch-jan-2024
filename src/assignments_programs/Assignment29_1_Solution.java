package assignments_programs;

public class Assignment29_1_Solution {
public static void main(String[] args) {
	int sum=0;
	for(int i=1;i<=5;i++) {
		int num=0;
		System.out.println(Math.sqrt(i));
		if(i%2==0) {
			num = (int)Math.ceil(Math.sqrt(i));
		}
		else {
			num = (int)Math.floor(Math.sqrt(i));
		}
		System.out.println(num);
		sum += num;
		
	}
	System.out.println("Sum is: "+sum);
}
}
