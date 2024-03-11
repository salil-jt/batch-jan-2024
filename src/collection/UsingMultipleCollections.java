package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class UsingMultipleCollections {
public static void main(String[] args) {
	ArrayList<Integer> nums = new ArrayList<>();//ArrayList of Integer
	nums.add(10);
	nums.add(15);
	nums.add(18);
	System.out.println("AL : "+nums);
	
	
	Student1 s1 = new Student1("Salil", 31, 'A');
	Student1 s2 = new Student1("Suresh", 25, 'C');
	ArrayList<Student1> studs = new ArrayList<>();//ArrayList of Student
	studs.add(s1);
	studs.add(s2);
	System.out.println("SAL:"+studs);
	
	
	ArrayList<ArrayList<String>> studentsInAllSections = new ArrayList<>();//ArrayList of Arraylists
	
	ArrayList<String> studentsInSectionA = new ArrayList<>();
	studentsInSectionA.add("Salil");
	studentsInSectionA.add("Suresh");
	System.out.println("studentsInSectionA:"+studentsInSectionA);
	
	ArrayList<String> studentsInSectionB = new ArrayList<>();
	studentsInSectionB.add("Mahesh");
	studentsInSectionB.add("Ramesh");
	System.out.println("studentsInSectionB:"+studentsInSectionB);
	
	
	studentsInAllSections.add(studentsInSectionA);
	studentsInAllSections.add(studentsInSectionB);
	System.out.println("Students in All Sections:"+studentsInAllSections);
	
	Map<String, List<String>> sectionStudentNames = new HashMap<>();
	
	sectionStudentNames.put("Section A", studentsInSectionA);
	sectionStudentNames.put("Section B", studentsInSectionB);
	System.out.println("sectionStudentNames: "+sectionStudentNames);
	
	
	Map<Map<String, ArrayList<String>>, Map<ArrayList<ArrayList<String>>, HashSet<String>>> hs;
}
}
