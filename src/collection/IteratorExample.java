package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorExample {
public static void main(String[] args) {
	ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    numbers.add(50);
    Iterator<Integer> itr = numbers.iterator();
    while (itr.hasNext()) 
    {
        int number = itr.next();
        System.out.println(number);
    }

    
    ArrayList ar = new ArrayList();
    ar.add("Black");
    ar.add("Red");
    ar.add("Blue");
    ListIterator litr = ar.listIterator();
    while (litr.hasNext()) // In forward direction
    {
        System.out.println(litr.next() + " ");
    }
    
    System.out.println("----Travel Backwards---");
    while (litr.hasPrevious()) // In reverse direction
    {
        System.out.println(litr.previous() + " ");
    }


}
}
