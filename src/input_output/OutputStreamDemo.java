package input_output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamDemo {
public static void main(String[] args) throws IOException {
	File f = new File("/Users/sabniss/Desktop/java-training/batch-jan-2024/sample1.txt");
	
	OutputStream os = new FileOutputStream(f); 
	if(f.exists()) // LINE C
    {
        System.out.println("File exists.");

        // LINE D
         byte b[] = {'i',' ','a','m',' ','f','i','l','e','O','n','e','.'};
        // Writing into file fileOne
         os.write(b);
    }
	os.close();
	InputStream is = new FileInputStream(f);
    int i = 0;
    while((i = is.read()) != -1)
    {
        System.out.print((char) i);
    }
    is.close();


}
}
