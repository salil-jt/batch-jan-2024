package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExploringArrayListPart2 {
public static void main(String[] args) {
	List<String> studNames = new ArrayList<>();
	//add elements to a list
	studNames.add("Ramesh");
	studNames.add("Suresh");
	studNames.add("Mahesh");
	studNames.add("New Student");
	System.out.println(studNames);
	
	Collections.sort(studNames);     
	System.out.println(studNames);
	System.out.println(studNames.get(3));
}
}
