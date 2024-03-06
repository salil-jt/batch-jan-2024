package collection;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(10);
    s.push(12);
    s.push(15);
    System.out.println(s);
    //if a stack is empty or not
    System.out.println(s.isEmpty());
    System.out.println(s.empty());
    
    System.out.println(s.pop());
    System.out.println(s);
    
    System.out.println(s.peek());
    System.out.println(s);
    
    while (!s.empty()) {
        System.out.println(s.peek());
        s.pop();
      }
  //  s.pop();// Gives exception when the stack is empty
  //  s.peek();//// Gives exception when the stack is empty
    System.out.println("------");
    System.out.println(s);
    s.push(10);
    s.push(12);
    s.push(15);
    s.push(17);
    System.out.println(s);
    System.out.println(s.search(12));
    System.out.println(s.search(17));
    System.out.println(s.search(10));
    System.out.println(s.search(15));
    System.out.println(s.search(25));
    System.out.println("---Index positions---");
    System.out.println(s.get(0));
    System.out.println(s.get(1));
   

}
}
