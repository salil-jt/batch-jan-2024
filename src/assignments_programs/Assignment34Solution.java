package assignments_programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment34Solution {
	
	public static void main(String[] args) {
		
		List<String> teacher1_subjects = new ArrayList<>();
		List<String> teacher2_subjects = new ArrayList<>();
		List<String> teacher3_subjects = new ArrayList<>();
		
		teacher1_subjects.add("Maths");
		teacher1_subjects.add("Java");
		teacher1_subjects.add("Science");
		
		teacher2_subjects.add("English");
		teacher2_subjects.add("Java");
		teacher2_subjects.add("Commerce");
		
		
		teacher3_subjects.add("Science");
		teacher3_subjects.add("Economics");
		teacher3_subjects.add("Chemistry");
		
		Teacher1 teacher1 = new Teacher1("Salil", 30, teacher1_subjects);
		Teacher1 teacher2 = new Teacher1("Ramesh", 25, teacher2_subjects);
		Teacher1 teacher3 = new Teacher1("Suresh", 30, teacher3_subjects);
		
		ArrayList<Teacher1> teachers = new ArrayList<>();
		teachers.add(teacher1);
		teachers.add(teacher2);
		teachers.add(teacher3);
		
		Set<String> uniqueSubjects = new HashSet<>();
		
		for(Teacher1 teacher : teachers) {
			uniqueSubjects.addAll(teacher.subjectsTaught);
		}
		System.out.println("Unqiue Subjects :"+uniqueSubjects);
		
		
		
	}

}

class Teacher1{
	String name;
	int age;
	List<String> subjectsTaught;
	public Teacher1(String name, int age, List<String> subjectsTaught) {
		this.name = name;
		this.age = age;
		this.subjectsTaught = subjectsTaught;
	}
	@Override
	public String toString() {
		return "Teacher1 [name=" + name + ", age=" + age + ", subjectsTaught=" + subjectsTaught + "]";
	}
	
	
	
}
