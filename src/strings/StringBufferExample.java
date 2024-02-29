package strings;

public class StringBufferExample {
public static void main(String[] args) {
	
	StringBuffer sb = new StringBuffer();
	System.out.println(sb.capacity());//defAULT CAPACITY - 16
	
	
	
	
	StringBuffer sb1 = new StringBuffer("Happy new year");
	StringBuffer sb2 = new StringBuffer(200);
	System.out.println(sb2.capacity());
	System.out.println(sb2.length());
	sb2 = new StringBuffer("Happy new year");
	System.out.println(sb2.length());
	
	
}
}
