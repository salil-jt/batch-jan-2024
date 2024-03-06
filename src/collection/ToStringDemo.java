package collection;

public class ToStringDemo {
public static void main(String[] args) {
	Student s1 = new Student("Salil", 31);
	Student s2 = new Student("Ramesh", 20);
	System.out.println(s1);
	System.out.println(s2);
	
	String name = "Salil";
	System.out.println("Name :"+name);
}
}
class Student{
	String name;
	int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
	
}