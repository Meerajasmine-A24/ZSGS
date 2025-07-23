//  convert decimal number to binary number

import java.util.Scanner;

public class Problem6{
  public static String decToBinary(int n){
	  if(n==0) return "0";
		StringBuilder ans=new StringBuilder();
	  while(n>0){
		  ans.insert(0,n%2);
		  n/=2;
	  }
	  
	 return ans.toString();
  }
  public static  void main(String[]args){
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter decimal number to get its binary form :");
	  int n=s.nextInt();
	  System.out.println("Binary form of"+n + "is :" + decToBinary(n));
  }
}

		  