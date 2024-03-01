package utilities;

import java.util.Scanner;

public class ScannerInputString {
public static void main(String[] args) {
	//Count of the number of words in a sentence
	
	Scanner sc = new Scanner(System.in);
	//String sentence = sc.next();
	//System.out.println("Sentence : "+sentence);
	
	String sentenceLine = sc.nextLine();
	System.out.println("Sentence : "+sentenceLine);
	
	String words[] =sentenceLine.split(" ");
	System.out.println("Total words is : "+words.length);
	
	sc.close();
	
	
}
}
