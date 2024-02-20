package assignments_programs;

class Student{
	
	int age;
	int id;
	int marks[];
	char section;
	int totalMarks;
	static int counttOfStudents;
	public Student(int age, int id, int[] marks, char section) {
		this.age = age;
		this.id = id;
		this.marks = marks;
		this.section = section;
		this.totalMarks = getTotalMarks(marks);
		counttOfStudents++;
	}
	
	public Student(int age, int id, int[] marks) {
		this.age = age;
		this.id = id;
		this.marks = marks;
		this.section = 'E';
		this.totalMarks = getTotalMarks(marks);
		counttOfStudents++;
	}
	
	int getTotalMarks(int[] marks) {
		
		int min = marks[0];
		int sum = marks[0];
		for(int i=1;i<marks.length;i++) {
			if(marks[i]<min) {
				min = marks[i];
			}
			sum += marks[i];
		}
		
		
		return sum - min;
	}
	
	char gradeOfStudentBasedOnMarks() {
		char grade=' ';
		if(totalMarks >=270 && totalMarks<=300) {
			grade = 'A';			
		}
		else if(totalMarks >=250 && totalMarks<=269) {
			grade = 'B';			
		}
		else if(totalMarks >=200 && totalMarks<=249) {
			grade = 'C';			
		}
		else if(totalMarks >=150 && totalMarks<=199) {
			grade = 'D';			
		}
		else if(totalMarks >=100 && totalMarks<=149) {
			grade = 'E';			
		}
		else if(totalMarks <100) {
			grade = 'F';			
		}
		
		
		
		return grade;
		
		
	}
	
	
	
	
}



public class Assignment16Solution {
	
	public static void main(String[] args) {
		
		int marks_s1[] = {40,70,60,35}; // 170
		int marks_s2[] = {80,40,90,35}; //210
		int marks_s3[] = {60,75,72,60}; //207
		
		
		final char STUDENT_SECTIONS[] = {'A','B','C','D','E'};
		
		Student s1 = new Student(12, 1, marks_s1,'A');
		Student s2 = new Student(14, 2, marks_s2,'B');
		Student s3 = new Student(15, 3, marks_s3,'B');
		
		System.out.println("Total no of students: "+Student.counttOfStudents);
		
		Student[] students = {s1,s2,s3};
		
		
		Student studentWithLowestMarks = students[0];
		Student studentWithHighestMarks =students[0];
		
		for(int i=0;i<students.length;i++) {
			
			
			System.out.println("Total Marks for :"+ students[i].id + " is : "+ students[i].totalMarks);
			if(students[i].totalMarks < studentWithLowestMarks.totalMarks) {
				studentWithLowestMarks = students[1];
			}
			if(students[i].totalMarks > studentWithLowestMarks.totalMarks) {
				studentWithHighestMarks = students[1];
			}
		}
		
		System.out.println("Student with highest marks, ID:"+studentWithHighestMarks.id + " , marks:"+studentWithHighestMarks.totalMarks);
		System.out.println("Student with lowest marks, ID:"+studentWithLowestMarks.id + " , marks:"+studentWithLowestMarks.totalMarks);
		
		
		
		System.out.println("Count of student section wise:");
		for(int i=0;i<STUDENT_SECTIONS.length;i++) {
			
			countOfStudentsInSection(students, STUDENT_SECTIONS[i]);
			
		}
		
	}
	
	
	public static void countOfStudentsInSection(Student []students, char section) {
		
		int count=0;
		for(int i=0;i<students.length;i++) {
			
			if(students[i].section==section) {
				count++;
			}
		}
		
		System.out.println("Section : "+section + " Count :: "+count);
	}

}
