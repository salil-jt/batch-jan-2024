package input_output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
public static void main(String[] args) throws IOException {
	
	//Reading an file
	File f = new File("/Users/sabniss/Desktop/java-training/batch-jan-2024/sample.txt");
	
	InputStream is = null;
	
	
	
	
	if (f.exists()) // LINE C
	{
		is = new FileInputStream(f); 
		int i = 0;
		//is.close(); if we close the is, we cannot read the file
		while ((i = is.read()) != -1) {
			System.out.print((char) i); // LINE F
		}

	}
	is.close();
	
	
}
}
