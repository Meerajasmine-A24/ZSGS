//  Create a method to read a file from disk. Handle FileNotFoundException and IOException using try-catch-finally.

import java.io.*;
public class Problem9{
   public static void main(String[]args){
	  FileReader fr=null;
	  String file="Sample.txt";
	  try{
		  fr=new FileReader(file);
		  int character;
		  System.out.println("Content of the file are : ");
		  while((character=fr.read())!=-1){
			  System.out.print((char)character);
		  }
	  }
		  catch(FileNotFoundException e){
			  System.out.println("File Not found exception caught");
			  e.printStackTrace();
		  }
		  catch(IOException e){
			  System.out.println("Error while reading the file.... IO Exception Caught ");
			  e.printStackTrace();
		  }
		  finally{
			  try{
				  if(fr!=null){
				  fr.close();
				    System.out.println("File readed Successfully");
				  }
			  }
			  catch(FileNotFoundException e){
			  System.out.println("File Not found exception caught");
			  e.printStackTrace();
			}
		  catch(IOException e){
			  System.out.println("Error while reading the file.... IO Exception Caught ");
			  e.printStackTrace();
		  }
		  }
   }
}

		  
			  
			  
			  
			  
		  
		  

