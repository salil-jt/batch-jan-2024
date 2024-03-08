package strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
public static void main(String[] args) {
	
	List<Character> characters = new ArrayList<Character>(); // 
    characters.add('A');
    characters.add('B');
    characters.add('C');
    characters.add('B');
    characters.add('A');
    System.out.println(characters);
    System.out.println("Size:"+characters.size());
    
    Set<Character> chars = new HashSet<>();
    chars.add('A');
    chars.add('B');
    chars.add('D');
    chars.add('A');
    chars.add('C');
    System.out.println(chars);
    System.out.println("Size: "+chars.size());
    
    
    Set<Character> chars_1 = new HashSet<>(characters);
    System.out.println(chars_1);
    
    System.out.println("--TreeSet--");
    TreeSet<Integer> nums = new TreeSet<>();
    nums.add(10);
    nums.add(1);
    nums.add(18);
    nums.add(12);
    System.out.println(nums);
    System.out.println(nums.first());
    System.out.println(nums.last());
    System.out.println(nums.higher(10));
    System.out.println(nums.lower(10));
	
}
}
