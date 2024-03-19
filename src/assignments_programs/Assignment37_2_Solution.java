package assignments_programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Assignment37_2_Solution {
public static void main(String[] args) {
	StudentP s1 = new StudentP(101,"Salil",31,"Hyd","IT");
	StudentP s2 = new StudentP(102,"Ramesh",28,"Hyd","CSE");
	StudentP s3 = new StudentP(103,"Mahesh",29,"Pune","EIE");
	StudentP s4 = new StudentP(104,"Mahesh",29,"Hyd","IT");
	StudentP s5 = new StudentP(105,"Ankush",29,"Pune","ECE");
	StudentP s6 = new StudentP(106,"Vishal",29,"Hyd","CSE");
	
	TreeSet<StudentP> treeSet = new TreeSet<>();
	treeSet.add(s1);
	treeSet.add(s2);
	treeSet.add(s3);
	treeSet.add(s4);
	treeSet.add(s5);
	treeSet.add(s6);
	System.out.println(treeSet);
	
	Map<String, Integer> studsDeptWise = new HashMap<>();
	
	for(StudentP stud: treeSet) {
		
		if(studsDeptWise.containsKey(stud.department)) {
			int count = studsDeptWise.get(stud.department);
			studsDeptWise.put(stud.department, count+1);
		}
		else {
			studsDeptWise.put(stud.department, 1);
		}
	}
	System.out.println(studsDeptWise);
	
	
	Map<String, List<String>> namesDeptWise = new HashMap<>();
	for(StudentP stud: treeSet) {
		
		if(namesDeptWise.containsKey(stud.department)) {
			List<String> names = namesDeptWise.get(stud.department);
			names.add(stud.name);
			namesDeptWise.put(stud.department, names);
			
		}
		else {
			List<String> names = new ArrayList<>();
			names.add(stud.name);
			namesDeptWise.put(stud.department, names);
		}
		
	}
	System.out.println(namesDeptWise);
}
}
class StudentP implements Comparable<StudentP>{
	int studId;
	String name;
	int age;
	String city;
	String department;
	public StudentP(int studId,String name, int age, String city, String department) {
		this.studId = studId;
		this.name = name;
		this.age = age;
		this.city = city;
		this.department = department;
	}
	@Override
	public int compareTo(StudentP o) {
		
		if(this.name.compareTo(o.name)==0) {
			
			if(this.department.compareTo(o.department)==0) {
				
				if(this.age-o.age ==0) {
					return this.studId-o.studId;
				}
				return this.age-o.age;
				
			}
			return this.department.compareTo(o.department);
		}
		
		return this.name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return "StudentP [studId=" + studId + ", name=" + name + ", age=" + age + ", city=" + city + ", department="
				+ department + "]";
	}
	

	
}
