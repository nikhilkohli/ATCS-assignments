package filehandling;

import java.io.*;

public class Filehandlefolderex {

	public static void main(String[] args) throws IOException {
		
		File f = new File("TestFile.txt");
		File f1 = new File("nikhil");
		
		
		f.createNewFile();
		
		boolean n = f1.mkdir();
		System.out.println(n);
		
		System.out.println("file created");

	}

}
