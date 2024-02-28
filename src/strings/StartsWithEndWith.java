package strings;

public class StartsWithEndWith {
public static void main(String[] args) {
	
	//Unibic
	String flavour_1 = "unibic pista";
	String flavour_2 = "unibic cashew";
	
	System.out.println(flavour_1.startsWith("unibic"));
	String prefix = "unibic";
	System.out.println(flavour_1.startsWith(prefix));
	
	
	System.out.println(flavour_2.endsWith("cashew"));
	System.out.println(flavour_2.endsWith("almond"));
	
	
	
	
}
}
