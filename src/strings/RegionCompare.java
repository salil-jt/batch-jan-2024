package strings;

public class RegionCompare {
public static void main(String[] args) {
	
	String fruit = "apple";
	boolean result = fruit.regionMatches(0, "pineapple", 4, 5);
	System.out.println(result);
	
	
}
}
