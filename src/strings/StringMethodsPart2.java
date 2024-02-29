package strings;

import java.util.Locale;

public class StringMethodsPart2 {
public static void main(String[] args) {
	
	String sentence = "Moon is bright";
	sentence = sentence.replace('o', 'i');
	System.out.println(sentence);
	
	String sentence1 = "Moon is bright";
	sentence1 = sentence1.replace("Moon", "Sun");
	System.out.println(sentence1);
	
	String sentence2 = "Moon is bright, Moon is far from earth";
	sentence2 = sentence2.replace("Moon", "Sun");
	System.out.println(sentence2);
	
	
	String studId = "KMIT-101";
	studId = studId.replaceAll("KMIT-", "");
	System.out.println(studId);
	
	
	//trim
	String name = "    KMIT   ";
	System.out.println(name.length());
	name = name.trim();
	System.out.println(name);
	System.out.println(name.length());
	
	
	//valueOf
	String temp = String.valueOf(12);
	System.out.println(temp);
	
	
	//lowercase and uppercase
	
	String fullName = "ROhit ShettY";
	fullName = fullName.toUpperCase();
	System.out.println(fullName);
	fullName = fullName.toLowerCase();
	System.out.println(fullName);
	
	String str = "turkish";
	Locale locale = new Locale("tr");
	System.out.println(str.toUpperCase(locale));
	
	
	//contains
	String text = "A finest quality product";
	System.out.println(text.contains("quality")); //true
	System.out.println(text.contains("qualitym"));//false
	
}
}
