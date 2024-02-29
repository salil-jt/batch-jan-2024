package strings;

public class DeleteAtStringBuffer {
public static void main(String[] args) {
	StringBuffer firstWord = new StringBuffer("Moring");
    System.out.println(firstWord);
    firstWord.delete(1, 4);
    System.out.println(firstWord);
    firstWord.deleteCharAt(0);
    System.out.println(firstWord);    

}
}
