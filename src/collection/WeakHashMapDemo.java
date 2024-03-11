package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
public static void main(String[] args) {
	
	Map weakmap=  (Map) new WeakHashMap();
	String one=new String("one");
    String two=new String("two");
    
    weakmap.put(one, "Salil");
    weakmap.put(two, "Suresh");
    System.out.println(weakmap);
    System.gc();
    System.out.println("Before: "+weakmap.get("one")+" "+weakmap.get("two"));
    one=null;
    two=null;
    System.out.println("After: "+weakmap.get("one")+" "+weakmap.get("two"));
    System.gc();
    System.out.println("After running gc: "+weakmap.get("one")+" "+weakmap.get("two"));   


    

	
	
	
}
}
