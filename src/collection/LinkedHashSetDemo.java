package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
public static void main(String[] args) {
	LinkedHashSet<String> lhs = new LinkedHashSet<String>();
    lhs.add("Anderson");
    lhs.add("Bharath");
    lhs.add("Cruse");
    lhs.add("Dinesh");
    System.out.println(lhs);
    
    HashSet<String> hs = new HashSet<String>();
    hs.add("Anderson");
    hs.add("Bharath");
    hs.add("Cruse");
    hs.add("Dinesh");
    System.out.println(hs);
    
    
    hs.clear();
    System.out.println(hs);

}
}
