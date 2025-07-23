// Grade of the student using if statement 

import java.util.Scanner;

public class Problem8{
	public static String grade(int marks){
		 if(marks>=85 && marks<=100){
		  return "A";
		 }
		 else if(marks>=70 && marks<85){
			 return "B";
		 }
		 else if(marks>=50 && marks<70){
			 return "C";
		 }
		 else{
			 return "Fail";
		 }
	}
		
  public static void main(String[]args){
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the mark of the student to get the grade :");
	  int marks=s.nextInt();
	  System.out.println("The Grade of the student was : "+grade(marks));
  }
}

	  
	  