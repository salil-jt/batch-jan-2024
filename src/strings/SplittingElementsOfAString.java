package strings;

public class SplittingElementsOfAString {
public static void main(String[] args) {
	
	
	String sentence = "This is a string example to break the sentence, let us check";
	
	String words[] = sentence.split(",");
	for(String word:words)
		System.out.println(word);
	
	
	String temp="sal";
	System.out.println(temp.length());
	System.out.println(temp.isEmpty());
}
}
