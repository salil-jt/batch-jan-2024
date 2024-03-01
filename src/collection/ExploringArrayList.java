package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExploringArrayList {
public static void main(String[] args) {
	
	String names[] = new String[3];
	names[0]="Ramesh";names[1]="Suresh";names[2]="Mahesh";
	
	for(String name:names) {
		if(name.equals("Suresh")) {
			System.out.println("Found");
		}
	}
	//names[3]="New Student";//We cannot do this, we will get java.lang.ArrayIndexOutOfBoundsException:
	System.out.println(names);
	
	List<String> studNames = new ArrayList<>();
	//add elements to a list
	studNames.add("Ramesh");
	studNames.add("Suresh");
	studNames.add("Mahesh");
	studNames.add("New Student");
	System.out.println(studNames);
	System.out.println("Size : "+studNames.size());
	System.out.println("Get element at an index: "+studNames.get(0));
	//System.out.println("Get element at an index: "+studNames.get(4));IndexOutOfBoundsException
	studNames.remove("Suresh");
	System.out.println("After: "+studNames);
	studNames.remove(1);
	System.out.println("After using remove index: "+studNames);
	
	System.out.println("Contains - to check if an element is present or not:"+ studNames.contains("Mahesh"));
	System.out.println("Contains - to check if an element is present or not:"+ studNames.contains("Ramesh"));
	
	
	//Iterator
	studNames.add("Keerti");
	studNames.add("Salil");
	System.out.println(studNames);
	
	System.out.println("Interate using iterator");
	Iterator<String> iterate = studNames.iterator();
	while(iterate.hasNext())
    {
        System.out.println(iterate.next());
    }  
	//iterate.next();
	System.out.println("--Iterate using for loop");
	for(int i=0; i<studNames.size();i++) {
		System.out.println(studNames.get(i));
	}
	System.out.println("--Iterate using advanced for loop");
	for(String name : studNames) {
		System.out.println(name);
	}
	
	

	
	
}
}
