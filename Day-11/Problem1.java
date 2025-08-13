// Write a Java program to read the contents of a text file and display it on the console.

import java.io.FileReader;
import java.io.IOException;

public class Problem1{
	public static void main(String[]args){
		FileReader fr=null;
		String filePath="SampleFile.txt";
		try{
			fr=new FileReader(filePath);
			int character;
			while((character = fr.read()) != -1) {
				System.out.print((char) character);
			}
		}
		catch(Exception e){
			System.out.println("Error occured while reading the file  ");
			e.printStackTrace();
		}
		finally{
			try{
			if(fr!=null){
				fr.close();
			}
			}
			catch(Exception e){
				System.out.println("Error occured while closing the file ");
				e.printStackTrace();
			}
		}
	}
}

			
		
				
		
