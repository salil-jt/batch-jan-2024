package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSample {
public static void main(String[] args) {
	Set<Integer> inputSet = new HashSet<Integer>(); // LINE A
	inputSet.add(1);
	inputSet.add(3);
	inputSet.add(2);
	inputSet.add(21);
	inputSet.add(6);
	inputSet.add(5);
	inputSet.add(4);
    System.out.println(inputSet); 
    System.out.println("---TreeeSet---");
	TreeSet<Integer> input = new TreeSet<Integer>(); // LINE A
    input.add(1);
    input.add(3);
    input.add(2);
    input.add(6);
    input.add(21);
    input.add(5);
    input.add(4);
    System.out.println(input); 
    System.out.println("First Element in Set : " + input.first()); // LINE C
    System.out.println("Last Element in Set : " + input.last()); 
    System.out.println("Element higher to 4 : " + input.higher(4)); // LINE E
    //higher returns the next higher number to the given number
    System.out.println("Element lower to 3 : " + input.lower(3));

}
}
