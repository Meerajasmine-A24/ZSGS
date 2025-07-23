// First Set Bits 


import java.util.Scanner;
public class Problem8{
	public static int firstSetBit(int n){
		int m=(n)&(n-1);
		m=m^n;
		
		int ans=(int) (Math.log(m) / Math.log(2)); 
		ans++;
		return ans;
	}
	
		
		
  public static void main(String[]args){
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter n to find the first set bit :");
	  int n=s.nextInt();
	  System.out.println("The first Set Bit of the number "+n+ " is : " + firstSetBit(n));
  }
}
	  