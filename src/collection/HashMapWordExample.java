package collection;

import java.util.HashMap;

public class HashMapWordExample {
public static void main(String[] args) {
	
	
	String sentence = "This is a sentence a big sentence which has a This big";
	//This - 2
	//is - 1
	//a = 3
	//sentence - 2
	
	HashMap<String, Integer> wordMap = new HashMap<>();
	String words[] = sentence.split(" ");
	
	for(String word : words) {
		
		if(wordMap.containsKey(word)) {
			int count = wordMap.get(word);
			wordMap.put(word, count+1);
		}
		else {
			wordMap.put(word, 1);
		}
		
	}
	System.out.println("Word Map:"+wordMap);
	
	
}
}
