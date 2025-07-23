// Check if the given number is power of Two

import java.util.Scanner;

public class Problem7{
  public static boolean isPowerOfTwo(int n){
	  while(n!=1){
		  if(n%2!=0){
			  return false;
		  }
		  n/=2;
	  }
	  return true;
  }
  
  public static void main(String[]args){
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter a Number :");
	  int n=s.nextInt();
	  System.out.println("The Number is Power of 2 :" +isPowerOfTwo(n));
  }
}
	  
	  