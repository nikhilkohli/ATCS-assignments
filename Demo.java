package filehandling;
import java.io.*;


public class Demo {

	public static void main(String[] args) throws IOException {

	    
	    File f= new File("welcome.txt"); //created file
		
		f.createNewFile();
		
		System.out.println("file is created");

	}

}
