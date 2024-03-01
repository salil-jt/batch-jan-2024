package utilities;

import java.util.Scanner;

public class ScannerExample {
public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	
	
	int number = sc.nextInt();
	
	
	if(number%2==0) {
		System.out.println("Num is positive");
	}
	else{
		System.out.println("Num is neagtive");
	}
	
	
}
}
