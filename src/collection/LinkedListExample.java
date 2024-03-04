package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
public static void main(String[] args) {
	LinkedList<Character> characters = new LinkedList();
	
	characters.add('A');
    characters.add('C');
    characters.add('D');

    System.out.println(characters);
    characters.add(1, 'B'); 
    System.out.println("characters: "+characters);
    
List<Character> characters_1 = new LinkedList();
	
characters_1.add('X');
characters_1.add('Y');
characters_1.add('Z');
System.out.println("characters_1 : "+characters_1);
    
    characters.addAll(characters_1);
    System.out.println(characters);
    characters.addFirst('F'); // LINE E
    characters.addLast('L'); 
    System.out.println(characters);
    characters.removeFirst(); // LINE H
    characters.removeLast(); 
    System.out.println(characters);
    Object[] newCharacters = characters.toArray(); 
    for (Object newCharacter : newCharacters)
    {
        System.out.print(newCharacter + ", ");
    }



	
}
}
