package strings;

public class StringGetCharsMethod {
public static void main(String[] args) {
	String source = "Happy Birthday";
	char[] dest = new char[20];
	dest[5] = 'N';
    dest[6] = 'E';
    dest[7] = 'W';
    dest[8] = 'Y';
    dest[9] = 'E';
    dest[10] = 'A';
    dest[11] = 'R';
   System.out.println( dest );
    source.getChars( 0, 5, dest, 5 );//Copies characters from this string into the destination character array.

    System.out.println( dest );
    
}
}
