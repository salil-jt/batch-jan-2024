package assignments_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assignment37_3_Solution {
public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Input on how many numbers you want to perform operations:");
	int input = sc.nextInt();
	System.out.println("Enter "+input + " numbers:");
	List<Integer> nums = new ArrayList<>();
	for(int i=0;i<input;i++) {
		
		int num = sc.nextInt();
		nums.add(num);
	}
	
	//Print the numbers in sorted manner
	Collections.sort(nums);
	System.out.println(nums);
	
	//Find min, max , sum and avg;
	int sum=0;int min=nums.get(0); int max=nums.get(0);
	double avg=0;
	for(int num:nums) {
		if(num < min) {
			min = num;
		}
		if(num > max) {
			max = num;
		}
		sum=sum+num;
	}
	avg = sum*1.0/nums.size();
	System.out.println("Min:"+min);
	System.out.println("Max:"+max);
	System.out.println("Sum:"+sum);
	System.out.println("Avg:"+avg);
}
}
