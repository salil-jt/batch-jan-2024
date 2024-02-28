package strings;

public class WaysToCreateAString {
public static void main(String[] args) {
	String s = "Hello World";//String literals
	System.out.println(s);
	
	
	
	String s1 = new String("Hello World");
	System.out.println(s1);
	
	char c[] = {'j', 'a', 'v', 'a'};
	String s2 = new String(c);
	System.out.println(s2);
	
}
}
