// find the sum of even numbers using continue statement

import java.util.Scanner;

public class Problem5{
    public static int evenSum(int n){
		if(n<0) throw new IllegalArgumentException("n should be Greater than 0");
		int sum=0;
		int i=1;
		while(i!=n){
			if(i%2!=0){
				i++;
				continue;
				
			}
			
			else
				sum+=i;
			    i++;
			    
		}
			
			return sum;
	}
	
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n to find sum of even numbers from 1 to n:");
		int n=s.nextInt();
		System.out.println("sum of 1 to n even number is :" + evenSum(n));
	}
}
	
	
		