package strings;

public class StringArrays {
public static void main(String[] args) {
	
	
	String names[] = {"Prem", "Siva", "Mahesh", "Srinath"}; 
	System.out.println(names.length);
	
	for(int i = 0 ;i <names.length ;i++) {
		System.out.println(names[i]);
	}
	System.out.println("---A diff for loop---");
	for(String xyz : names) {
		System.out.println(xyz);
		
	}
	
	int arr[] = {10,6,5,9};
	for(int ele:arr) {
		System.out.println(ele);
	}
	
	
	
}
}
