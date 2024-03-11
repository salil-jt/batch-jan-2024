package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateOverAMap {
public static void main(String[] args) {
	HashMap<String, Double> hm = new HashMap<String, Double>();
    hm.put("Santosh", new Double(3020.55));
    hm.put("Ram", new Double(2550.22));
    hm.put("Nishan", new Double(2060.66));
    hm.put("Amar", new Double(1890.88));
    hm.put("Om", new Double(1650.11));
    System.out.println("After initializing : " + hm);
    
    System.out.println("--Iterate over Map 1--");
    for(Map.Entry<String, Double> entry:hm.entrySet()) {
    	System.out.println(entry.getKey()+ ":" + entry.getValue());
    }
    
    
    System.out.println("--Iterate over Map 2--");
    Set set = hm.entrySet(); 
    System.out.println("Set:"+set);
    

    
    
    Iterator i = set.iterator(); // Iterating to set
    while (i.hasNext()) {
        // Assigning iterator to map entry
        Map.Entry m = (Map.Entry) i.next();
        
        // Getting key and value from map entry
        System.out.println(m.getKey() + " : " + m.getValue());
        System.out.println("Length of the word is:"+ ((String)m.getKey()).length());
    }

    
    
    Set<Integer> nums = new HashSet<>();
    nums.add(10);
    nums.add(20);
    nums.add(14);
    for(Integer num:nums) {
    	System.out.println(num);
    }

}
}
