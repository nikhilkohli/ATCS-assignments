package filehandling;

import java.io.*;

public class BufferWriterex {
	
	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw= new FileWriter("welcome.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		
		bw.write("welcome");
		bw.write("to ");
		bw.write("java");
		bw.write("session");
		bw.write(97);
		bw.write(107);
		bw.write(147);
		
		bw.close();
			
		System.out.println("inserted by using Buffered writer");
		
	}

}
