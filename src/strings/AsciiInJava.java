package strings;

public class AsciiInJava {
public static void main(String[] args) {
	
    char ch = 'A';
    System.out.println(ch);
    System.out.println("---Converted a char to a number");
    int ascii = ch;
    System.out.println(ascii); //'a' or
    
    int castAscii = (int) ch;
    System.out.println(castAscii);
    
    System.out.println("----Converted a number to a char----");
    int number = 97;
    System.out.println(number); //97
    char result = (char)number;
    System.out.println(result);
    
    System.out.println("---Printing char from a to z--");
    
    for(int start = 97 ; start <=122; start++) {
    	System.out.println((char)start);
    }
    
    int num = 0;
    char digit = '0';
	
}
}
