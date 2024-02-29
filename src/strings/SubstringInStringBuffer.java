package strings;

public class SubstringInStringBuffer {
public static void main(String[] args) {
	StringBuffer name = new StringBuffer("Wednesday");
    String firstPart = name.substring(0, 5);
    String secondPart = name.substring(5);
    System.out.println(firstPart);
    System.out.println(secondPart);
    
   // String thirdPart = name.substring(10);//StringIndexOutOfBoundsException

}
}
