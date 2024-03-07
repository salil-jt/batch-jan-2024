package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ComparatorDemo {
public static void main(String[] args) {
    List list = new ArrayList<>();
    list.add(new Student2("Ramesh", 30, 20));
    list.add(new Student2("Adithya", 7, 10));
    list.add(new Student2("Krishna", 25, 5));
    list.add(new Student2("Vineet", 24, 15));
    System.out.println(list);
 //  Collections.sort(list, new AgeComparator());
   // System.out.println(list);
    Collections.sort(list, new RollComparator());
    System.out.println("Sorted acc to RollNo:"+list);
    
    
    TreeSet<Student2> hashStud = new TreeSet<>(new RollComparator());
    hashStud.add(new Student2("Ramesh", 30, 20));
    hashStud.add(new Student2("Adithya", 7, 10));
    System.out.println(hashStud);
    
    /*
    List<Integer> list_1 = new ArrayList<>();
    list_1.add(10);
    list_1.add(5);
    list_1.add(8);
    list_1.add(2);
    System.out.println("List 1 : "+list_1);
    Collections.sort(list_1);
    System.out.println("List 1 Sorted : "+list_1);
*/

	
	
}
}
class Student2 {
	   String name;
	   int age, roll;
	   Student2(String name, int age, int roll) {
	      this.name = name;
	      this.age = age;
	      this.roll = roll;
	   }
	@Override
	public String toString() {
		return "Student2 [name=" + name + ", age=" + age + ", roll=" + roll + "]";
	}
	   
	   
	}
class AgeComparator implements Comparator {
	   @Override
	   public int compare(Object o1, Object o2) {
	      return ((Student2) o1).age - ((Student2) o2).age;
	   }
	}
class RollComparator implements Comparator {
	   @Override
	   public int compare(Object o1, Object o2) {
	      return ((Student2) o1).roll - ((Student2) o2).roll;
	   }
	}

