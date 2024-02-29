package strings;

public class StringBufferAppend {
public static void main(String[] args) {
	StringBuffer a1 = new StringBuffer("abc");
    StringBuffer a2 = new StringBuffer("def");
    System.out.println("Appending another StringBuffer-:: "+ a1.append(a2));
    System.out.println("A1 : "+a1);
    System.out.println("A2 : "+a2);
    
    
    char c1[] = {'j','k','l'};
    System.out.println("Appending a  character array- "+ a1.append(c1));
    System.out.println("A1 after change:"+a1);
    
    
    //Insert in SB
    StringBuffer sb = new StringBuffer("Happy Diwali "); 
    sb.insert(sb.length(), " to everyone!!"); 
    System.out.println("Afyer change: "+sb);
}
}
