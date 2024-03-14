package input_output;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
public static void main(String[] args) throws IOException {
	String content = "This is the content to write into file.";
	File file = new File("/Users/sabniss/Desktop/java-training/batch-jan-2024/sample2.txt");
	FileWriter fw = new FileWriter(file.getAbsoluteFile());
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write(content); // LINE A
    bw.close();


}
}
