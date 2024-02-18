package arrays;
public class StudentMarksArray {
   public static void main(String []args) {

	int marks[] = {60,70,75,65,72};
	
	//Access the first element value
	System.out.println(marks[0]);
	
	System.out.println(marks);
	
	
	//Sum of the elements of marks
	System.out.println(marks[0]+marks[1]+marks[2]+marks[3]+marks[4]);
	
	
	
	//try to access an index which is not present
	//System.out.println(marks[10]); ArrayIndexOutOfBoundsException:
	
	
	
	//Length of array
	System.out.println("Len of array: "+marks.length); //access length using dot notation
	
	
	//Sum of the marks
   	int sum =0;
   	
  	for(int i=0;i<marks.length;i++){
   		//sum = sum+marks[i];
   		System.out.println("ELement : "+marks[i]);
   		
   	}
   	
   	System.out.println(sum);
   	
   	
   	
   	int prices[] = new int[3];
   	prices[0] = 89;
   	prices[1] = 100;
   	prices[2] = 67;
   
   
   }
   }
