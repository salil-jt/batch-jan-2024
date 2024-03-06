package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
public static void main(String[] args) {
	Set obj;
	HashSet<Integer> o1;
	
	List<Character> characters = new ArrayList<Character>(); // 
    characters.add('A');
    characters.add('B');
    characters.add('C');
    characters.add('D');
    characters.add('D');
    characters.add('Z');
    characters.add('A');
    System.out.println("List : "+characters);
    
	Set<Character> characters_1 = new HashSet<Character>(); // 
	characters_1.add('C');
	characters_1.add('A');
	characters_1.add('B');
	characters_1.add('C');
	characters_1.add('D');
	characters_1.add('D');
	characters_1.add('Z');
	characters_1.add('A');
	System.out.println("Set : "+characters_1);
	System.out.println("Size : "+characters_1.size());
	for(Character c:characters_1) {
		System.out.println(c);
	}
	
	Set<Character> characters_2 = new HashSet<>();
	
	characters_2.add('J');
	characters_2.add('K');
	characters_2.add('K');
	characters_2.add('K');
	characters_2.add('A');
	characters_1.addAll(characters_2);
	System.out.println(characters_1);
	
	
	
	ArrayList<Integer> ob = new ArrayList<>();
	ob.add(10);
	//ob.add("salil"); because ob is Integer
	
	ArrayList obj_1 = new ArrayList<>();
	obj_1.add("Salil");
	obj_1.add(123);
	obj_1.add('C');
	System.out.println(obj_1);
	for(Object num:obj_1) {
		System.out.println(num);
	}
	
	
	//Remove All Method
	ArrayList<Integer> univ1 = new ArrayList<>();
	ArrayList<Integer> univ2 = new ArrayList<>();
	univ1.add(101);univ1.add(201);univ1.add(301);
	univ2.add(101);univ2.add(202);univ2.add(302);
	System.out.println("univ1: "+univ1);
	System.out.println("univ2:"+univ2);
	
	univ1.removeAll(univ2);
	System.out.println("univ1 after: "+univ1);
	System.out.println("univ2 after:"+univ2);
	System.out.println("---Retain All---");
	univ1.add(302);
	System.out.println("univ1 after: "+univ1);
	System.out.println("univ2 after:"+univ2);
	
	univ1.retainAll(univ2);
	System.out.println("univ1 after: "+univ1);
	System.out.println("univ2 after:"+univ2);
	
	
	//Using List to create a Set
	ArrayList<Integer> stud_ids = new ArrayList<>();
	stud_ids.add(10);stud_ids.add(11);stud_ids.add(12);stud_ids.add(10);
	System.out.println("List:"+stud_ids);
	HashSet<Integer> stud_ids_new = new HashSet<>(stud_ids);
	System.out.println("Set : "+stud_ids_new);
	
	ArrayList<Integer> stud_ids_2 = new ArrayList<>(stud_ids_new);
	System.out.println("stud_ids_2 : "+stud_ids_2);
	

}
}
