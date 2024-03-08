package collection;

import java.util.HashMap;
import java.util.Map;

public class ExploringMap {
public static void main(String[] args) {
	
	
	Map obj;
	HashMap<Integer, String> studIds = new HashMap<>();
	studIds.put(8, "Prakash"); // Put method
    studIds.put(31, "Shabaz");
    studIds.put(16, "Salil");
    studIds.put(26, "Raj ");
    studIds.put(14, "Salil");
    studIds.put(5, "Gopi");
    System.out.println(studIds);
    studIds.put(5, "Rahil");
    System.out.println(studIds);
    
    System.out.println("---Get Element---");
    String name = studIds.get(2);
    System.out.println("Name is:"+name);//if the key is not found , the value returned is null

    
    System.out.println("Size is:"+studIds.size());
    System.out.println("Keys : "+studIds.keySet());
    System.out.println("Values : "+studIds.values());
    System.out.println("Check if a key is present or not:" +studIds.containsKey(14));
    System.out.println("Check if a key is present or not:" +studIds.containsKey(4));
    System.out.println("Check if a value is present or not:" +studIds.containsValue("Salil"));
    System.out.println("Check if map empty:" +studIds.isEmpty());
    System.out.println("Remove a key: "+studIds.remove(26));
    System.out.println(studIds);
    //studIds.clear();
    System.out.println(studIds);
    System.out.println("Check if map empty:" +studIds.isEmpty());

    HashMap<Integer, String> newStudIds = new HashMap<>();
    newStudIds.put(101, "Manik"); // Put method
    newStudIds.put(102, "Pranav");
    
    studIds.putAll(newStudIds);
    System.out.println(studIds);
    System.out.println("Entry set : " + studIds.entrySet());
}
}
