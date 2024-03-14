package input_output;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new FileReader("/Users/sabniss/Desktop/java-training/batch-jan-2024/sample.txt"));
	System.out.println((char) br.read());
	System.out.println((char) br.read());
	boolean ready = false;
    ready = br.ready(); // LINE C
    System.out.println("Buffered reader is ready : " + ready);
    br.skip(5); 
    //Hello World, This is a sample test file
    System.out.println((char) br.read());
    
  //  br.close();
   // br.read(); stream is closed cannot access
    String line="";
    StringBuffer sb = new StringBuffer();
    while((line=br.readLine())!=null)  
    {  
    sb.append(line);      //appends line to string buffer  
    sb.append("\n");     //line feed   
    }  
    
    System.out.println(sb);
    br.close();


}
}
