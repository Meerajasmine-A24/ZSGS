// Column Title in Excel Sheet 

import java.util.Scanner;

public class Problem2{
   public static  String column(int n){
	   StringBuilder  result=new StringBuilder();
         while(n>0){
			 n--;
			 char ch=(char) ('A' + (n%26));
			 result.insert(0,ch);
			 n/=26;
		 }
		 return result.toString();
   }
   public static void main(String[]args){
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter the column number :");
	   int n=s.nextInt();
	   System.out.println("The column title for the column number " +n+" is :" + column(n));
	   s.close();
   }
}

	   
			 