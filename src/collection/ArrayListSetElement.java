package collection;

import java.util.ArrayList;

public class ArrayListSetElement {
public static void main(String[] args) {
    ArrayList<Integer> num= new ArrayList<Integer>();
    num.add(15);
    num.add(9);
    num.add(20);
    num.add(35);
    System.out.println("Arraylist num : " + num);
  //Replacing element present at 0th index with 40
    num.set(0,40);        
    System.out.println("Arraylist After : " + num);
    
    
    System.out.println(num.isEmpty());


}
}
