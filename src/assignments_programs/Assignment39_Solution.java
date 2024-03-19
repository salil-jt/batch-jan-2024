package assignments_programs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Assignment39_Solution {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new FileReader("/Users/sabniss/Desktop/java-training/batch-jan-2024/sample.txt"));
	String line="";
	ArrayList<String> lines = new ArrayList<>();
    while((line=br.readLine())!=null)  
    {  
     lines.add(line);
    }  
    System.out.println(lines);
    
    Map<String, Integer> wordMap=new HashMap<>();
    
    for(String ln:lines) {
    	String words[]=ln.split(" ");
    	for(String word : words) {
    		
    		if(wordMap.containsKey(word)) {
    			int count = wordMap.get(word);
    			wordMap.put(word, count+1);
    		}
    		else {
    			wordMap.put(word, 1);
    		}
    		
    	}
    }
    System.out.println(wordMap);
    BufferedWriter bw = new BufferedWriter(new FileWriter(new File("/Users/sabniss/Desktop/java-training/batch-jan-2024/sample3.txt")));
    bw.write(wordMap.toString());
    
    br.close();
    bw.close();
}
}
