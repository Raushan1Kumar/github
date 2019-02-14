package Io;

import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		try {
		FileReader reader =new FileReader("D://textfile.txt");
		int Char;
		while((Char=reader.read()) != -1) {
			System.out.print((char) Char);
		}
		reader.close();
		}catch(IOException e) {
			
		}
	}

}
