package strings;

public class StringBufferMethodsPart1 {
public static void main(String[] args) {
	
	
	StringBuffer sb = new StringBuffer("Good Morning, Thursday");
	sb.setCharAt(5, '*');  //LINE A
    System.out.println(sb);
    
    StringBuffer sb1 = new StringBuffer("C++,Java,C");
    System.out.println("Before:"+sb1);
    sb1.replace(4, 8,"HTML");    //LINE B
    System.out.println("After:"+sb1);
    
    StringBuffer sb2 = new StringBuffer("Hapy");
    sb2.insert(2,'z');
    System.out.println(sb2);



	
	
}
}
