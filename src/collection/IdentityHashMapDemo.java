package collection;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
public static void main(String[] args) {
	IdentityHashMap hm = new IdentityHashMap();
	Integer i1 = new Integer(10);
    Integer i2 = new Integer(10);
    hm.put(i1, "Sachin");
    hm.put(i2, "Dravid");
    System.out.println(hm);

}
}
