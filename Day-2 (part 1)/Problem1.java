// minimum of three numbers using if statement

import java.util.Scanner;
public class Problem1{
   public static int minThree(int a,int b,int c){
       if(a<b && a<c){
		   return a;
	   }
	   else if(b<a && b<c){
		   return b;
	   }
	   else {
		   return c;
	   }
   }
   public static void main(String[]args){
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter first Number :");
	   int a=s.nextInt();
	   System.out.println("Enter Second Number :");
	   int b=s.nextInt();
	   System.out.println("Enter third Number :");
	   int c=s.nextInt();
	   System.out.println("Minimum number among three numbers is :" +minThree(a,b,c));
   }
}

	   