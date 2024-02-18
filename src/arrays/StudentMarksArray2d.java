package arrays;
public class StudentMarksArray2d {
   public static void main(String []args) {

	int marks_stud1[] = {60,70,80};
	int marks_stud2[] = {50,40,70};
	int marks_stud3[] = {55,45,70};
	
	int marks_student[][] = new int[3][3];
	marks_student[1][1] = 40;
	System.out.println(marks_student[1][1]);
	
	
	int b = marks_student[1][1];
	System.out.println("Marks student [1][1]:"+b);
	
	int stud_marks[][] = { {60,70,80} , {50,40,70} ,  {55,45,70} }; //array of arrays
	
	
	
	System.out.println("Len: "+ stud_marks.length);
	
	
	
	for(int i=0;i < stud_marks.length ;i++){
	
		for(int j=0; j < stud_marks.length;j++){
		
			System.out.print(stud_marks[i][j] + " ");
			//00,01,02
			//10,11,12
			//20,21,22
		
		}
		System.out.println();
	
	}
	
	
   
   
   }
   }
