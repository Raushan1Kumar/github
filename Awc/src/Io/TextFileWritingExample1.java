package Io;

import java.io.FileWriter;
import java.io.IOException;

public class TextFileWritingExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            FileWriter writer = new FileWriter("D://MyFile.txt", true);
            
            writer.write("Hello World");
            writer.write("\r\n");   // write new line
            writer.write("Good Bye!");
            
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
	}

}
