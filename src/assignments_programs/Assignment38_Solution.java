package assignments_programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Assignment38_Solution {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	
	String input=sc.next();
	String nums[] = input.split(",");
	
	ArrayList<String> numbers = new ArrayList<>();
	for(String num:nums)
		numbers.add(num);
	
	System.out.println(numbers + " ::  " +" Nums Size :"+numbers.size());
	Set<String> uniqueNumbers = new HashSet<>(numbers);
	System.out.println(uniqueNumbers + " ::  " +" uniqueNumbers Nums Size :"+uniqueNumbers.size());
	
	
}
}
