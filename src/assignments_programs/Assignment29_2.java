package assignments_programs;

import java.util.Scanner;

public class Assignment29_2 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	String input = sc.nextLine();
	
	String tokens[] = input.split(",");
	
	int noOfCharacters = numberOfCharacters(tokens[0]);
	
	int sumOfDigitsOfYear = sumOfDigitsOfYear(tokens[1]);
	
	int favoriteNumber = favoriteNumber(tokens[2]);
	
	System.out.println("noOfCharacters : "+noOfCharacters);
	System.out.println("sumOfDigitsOfYear : "+sumOfDigitsOfYear);
	System.out.println("favoriteNumber : "+favoriteNumber);
	System.out.println("Sum of all : "+(noOfCharacters+sumOfDigitsOfYear+favoriteNumber));
	
}

private static int favoriteNumber(String input) {
	
	return (int)Math.pow(Double.parseDouble(input), 3);
	
}

private static int sumOfDigitsOfYear(String input) {
	int sum=0;
	for(char c:input.toCharArray()) {
		sum+=c-'0';
	}
	return sum;
}

private static int numberOfCharacters(String input) {
	return input.length();
	
}
}
