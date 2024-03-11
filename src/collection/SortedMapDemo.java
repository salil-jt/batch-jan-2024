package collection;

import java.util.TreeMap;

public class SortedMapDemo {
public static void main(String[] args) {
	TreeMap<String, Double> tm = new TreeMap<String, Double>();
    tm.put("Santosh", new Double(3020.55));
    tm.put("Ram", new Double(2550.22));
    tm.put("Nishan", new Double(2060.66));
    tm.put("Amar", new Double(1890.88));
    tm.put("Om", new Double(1650.11));
    System.out.println("Map after initialization : " + tm);
    System.out.println("Head map : " + tm.headMap("Om"));
    System.out.println("Sub map : " + tm.subMap("Nishan", "Santosh")); // >Nishan and <=Santosh
    System.out.println("Tail map : " + tm.tailMap("Om"));

    
    
    
    /* o1 = new XYZ("Salil", 31);
    TreeMap<XYZ, String> tmXYZ = new TreeMap<>();
    tmXYZ.put(o1, "First Object");//We need to implement the Comparable interface on the XYZ class. Same thing as we did with TreeSet*/
}
}
class XYZ{
	String name;
	int age;
	public XYZ(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
