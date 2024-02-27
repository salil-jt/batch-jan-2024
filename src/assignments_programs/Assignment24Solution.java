package assignments_programs;

public class Assignment24Solution {
	public static void main(String[] args) {

		Student1 stud1 = new Student1("Abhishek", 20, "Hyderabad", 1, ' ');
		Student1 stud2 = new Student1("Prakash", 12, "Rajasthan", 2, ' ');
		Student1 stud3 = new Student1("Bharat", 27, "Rajasthan", 3, ' ');

		Teacher teacher1 = new Teacher("Laxmi", 35, "Hyderabad", 101, "English", 20000);
		Teacher teacher2 = new Teacher("Aruna", 30, "Pune", 102, "Maths", 30000);

		teacher1.updateGrades(stud1, 'A');
		teacher1.updateGrades(stud2, 'B');
		teacher2.updateGrades(stud3, 'C');

		Teacher[] teachers = new Teacher[2];
		teachers[0] = teacher1;
		teachers[1] = teacher2;
		printDetails(teachers);

		Student1[] studs = new Student1[3];
		studs[0] = stud1;
		studs[1] = stud2;
		studs[2] = stud3;
		printDetails(studs);

		findYoungestStudent(studs);

		findTeacherWithHighestSalary(teachers);

	}

	private static void findTeacherWithHighestSalary(Teacher[] teachers) {

		Teacher teacherWithHighSalary = teachers[0];

		for (int i = 0; i < teachers.length; i++) {
			if (teachers[i].getSalary() > teacherWithHighSalary.getSalary())
				teacherWithHighSalary = teachers[i];
		}

		System.out.println("Teacher With highest Salary:");
		teacherWithHighSalary.getDetails();
	}

	private static void findYoungestStudent(Student1[] studs) {

		Student1 youngest = studs[0];

		for (int i = 0; i < studs.length; i++) {
			if (studs[i].getAge() < youngest.getAge())
				youngest = studs[i];
		}

		System.out.println("Youngest student:");
		youngest.getDetails();

	}

	private static void printDetails(IDetails[] persons) {
		for (int i = 0; i < persons.length; i++) {
			persons[i].getDetails();
		}

	}

}

abstract class Person {

	private String name;
	private int age;
	String address;

	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

interface IDetails {
	void getDetails();

}

class Student1 extends Person implements IDetails 
{
	private int studentId;
	private char grade;

	public Student1(String name, int age, String address, int studentId, char grade) {
		super(name, age, address);
		this.studentId = studentId;
		this.grade = grade;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	@Override
	public void getDetails() {
		System.out.println("Student Id: " + studentId);
		System.out.println("Student Name: " + getName());
		System.out.println("Student Grade: " + grade);

	}

}

class Teacher extends Person implements IDetails {
	private int teacherId;
	String subject;
	private int salary;

	public Teacher(String name, int age, String address, int teacherId, String subject, int salary) {
		super(name, age, address);
		this.teacherId = teacherId;
		this.subject = subject;
		this.salary = salary;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	void updateGrades(Student1 student, char grade) {
		student.setGrade(grade);
	}

	@Override
	public void getDetails() {
		System.out.println("Teacher Id: " + teacherId);
		System.out.println("Teacher Name: " + getName());
		System.out.println("Teacher Subject: " + subject);

	}

}
