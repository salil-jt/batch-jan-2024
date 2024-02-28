package strings;

public class StringConcatentation {
public static void main(String[] args) {
	
	//concatenation : +
	int id = 201;
	int age = 31;
	String name = "Salil" + "  Sabnis " + id + age;
	String name2 = "Salil" + "  Sabnis " + (id + age);
	System.out.println(name);
	System.out.println(name2);
	System.out.println("My name is "+ name + " . In class");
	
	
}
}
