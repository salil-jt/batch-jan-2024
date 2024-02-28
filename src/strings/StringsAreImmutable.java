package strings;

public class StringsAreImmutable {
public static void main(String[] args) {
	   String s="Rohit";  
	   String s1=s.concat(" Shetty");//
	   System.out.println(s); //Rohit
	   System.out.println(s1); //Rohit Shetty
	   
	   System.out.println("-----Strings are immutable----");
	   
	   String obj1 = "Salil";
	   String obj2 = obj1;
	   System.out.println("OBJ1 : "+obj1);
	   System.out.println("OBJ2 : "+obj2);
	   
	   obj1 = "Salil Sabnis";
	   System.out.println("OBJ1 : "+obj1);
	   System.out.println("OBJ2 : "+obj2);
}
}
