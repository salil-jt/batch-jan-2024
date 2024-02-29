package strings;

public class StringCapacityJava {
public static void main(String[] args) {
	
	StringBuffer buff = new StringBuffer("");
	System.out.println("empty capacity = " + buff.capacity());
	
	
	buff = new StringBuffer("Java"); 
	System.out.println("Length : "+buff.length());
	System.out.println("Capacity: "+buff.capacity());
	
	System.out.println("------------------");
	
	StringBuffer sb = new StringBuffer(6);
	System.out.println("Initial Capacity : "+sb.capacity());//16
	sb.append("Happy Diwali xyz");//16
	System.out.println("Length of sb : " + sb.length());//30
	System.out.println("StringBuffer capacity : " + sb.capacity());
	
	
	System.out.println("SB Length");
	
	StringBuffer sb_1 = new StringBuffer("Java Programming");
	System.out.println("Length: "+sb_1.length());
	sb_1.setLength(18); 
	System.out.println("Length After changing: "+sb_1.length());
	sb_1.setLength(4); 
	System.out.println("Length After changing: "+sb_1.length());
	System.out.println("sb_1:"+sb_1);
	
	System.out.println(sb_1.charAt(1));
	sb_1.setCharAt(1, 'o');
	System.out.println("sb_1:"+sb_1);
	
	
	StringBuffer sb_2 = new StringBuffer("Java Programming");
	sb_2.replace(0, 4, "HMTL");
	System.out.println("Replace String:"+sb_2);
	
	
}
}
