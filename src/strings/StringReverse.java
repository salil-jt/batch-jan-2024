package strings;

public class StringReverse {
public static void main(String[] args) {
	
	StringBuffer firstWord = new StringBuffer("Hello World");
	System.out.println(firstWord.reverse());
	
	String name = "Hello World";
	StringBuffer temp = new StringBuffer(name);
	System.out.println(temp.reverse());
	
	
	
}
}
