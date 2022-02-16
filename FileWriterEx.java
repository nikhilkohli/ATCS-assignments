package filehandling;

import java.io.*;

public class FileWriterEx {
	
	public static void main(String[] args) throws IOException {
		
        FileWriter fw= new FileWriter("welcome.txt");
		
		fw.write("welcome");
		fw.write("to ");
		fw.write("java");
		fw.write("session");
		fw.write(97);
		fw.write(107);
		fw.close();
		System.out.println("data is inserted");
		
	}
}
	
