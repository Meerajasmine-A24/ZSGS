//  Write a Java program to append a text read from the user to an existing file without overwriting the original content.

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Problem4{
	public static void main(String[]args){
		try{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter file path to append text in a file  ");
		String filePath=s.nextLine();
		FileWriter fw=new FileWriter(filePath,true);
		BufferedWriter bw=new BufferedWriter(fw);
		System.out.println("Enter text to append on that file ");
		String text=s.nextLine();
		bw.write(text);
		bw.newLine();
		bw.close();
		System.out.println("The content was added to the file successfully");
		}
		catch(IOException e){
			System.out.println("Error Occured while writing an content to the file : "+e);
		}
	}
}

		  