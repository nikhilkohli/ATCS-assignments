package filehandling;

import java.io.*;

public class BufferReaderex {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr= new FileReader("welcome.txt");
		BufferedReader br= new BufferedReader(fr);
		
		
		String data=br.readLine();
		
		while(data!=null) {
			
			System.out.println(data);
			data=br.readLine();
		}
		
	}
	
	

}
