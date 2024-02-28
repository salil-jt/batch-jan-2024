package strings;

public class IndexOfLastIndexOf {
public static void main(String[] args) {
	String str = "The Sun rises in the east and sets in the west.";
	System.out.println("Length : "+str.length());
	
	
	System.out.println("Index of the:"+str.indexOf("The"));
	System.out.println("Index of the:"+str.indexOf("the"));
	System.out.println("Index of the:"+str.lastIndexOf("the"));
	System.out.println("Index of the:"+str.lastIndexOf("they"));
}
}
