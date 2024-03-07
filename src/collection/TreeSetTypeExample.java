package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetTypeExample {
public static void main(String[] args) {
	Student1 s1 = new Student1("Salil", 31,'A');
	Student1 s2 = new Student1("Ramesh", 32,'A');
	Student1 s3 = new Student1("Mahesh", 21,'D');
	//Mahesh,Ramesh,Salil 
	
	ArrayList<Student1> studs_list = new ArrayList<>();
	studs_list.add(s1);
	studs_list.add(s2);
	studs_list.add(s3);
	
	for(Student1 stud : studs_list) {
		System.out.println("Name : "+stud.name);
	}
	System.out.println("=--HashSet---");
	HashSet<Student1> studs_hs = new HashSet<>();
	studs_hs.add(s1);
	studs_hs.add(s2);
	studs_hs.add(s3);
	System.out.println(studs_hs);
	
	Comparable i;
	
	System.out.println("=--TreeSet---");
	TreeSet<Student1> studs = new TreeSet<>();
	studs.add(s1);
	studs.add(s2);
	studs.add(s3);
	System.out.println(studs);
}
}
class Student1 implements Comparable<Student1>{
	String name;
	int age;
	char section;
	int rollNo;
	public Student1(String name, int age,char section) {
		super();
		this.name = name;
		this.age = age;
		this.section=section;
	}
	@Override
	public int compareTo(Student1 o) {
		// TODO Auto-generated method stub
		//if we want to compare on age
		//return this.age-o.age;
		//return this.section - o.section;
		
		
		if(this.name.compareTo(o.name)==0) {
			
			if(this.section == o.section) {
				return this.age - o.age;
			}
			
			return this.section - o.section;
		}
		else {
		
		return this.name.compareTo(o.name);
		}
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", age=" + age + ", section=" + section + "]";
	}
	
	
	
	
}