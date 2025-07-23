// Write a program which generates 30 terms of Fibonacci no in an array and then prints it.

import java.util.Scanner;
 class Fibbonacci{
	 int[]dp=new int[30];
	public  void  fibbonacciSeries(int n){
		dp[0]=0;
		dp[1]=1;
     for(int i=2;i<n;i++){
		 dp[i]=dp[i-1]+dp[i-2];
	 }
	}
	public void print(){
		for(int num:dp){
			System.out.print(num+" ");
		}
			
	}
	
		
}
	public class Problem3{
	
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		Fibbonacci pb=new Fibbonacci();
		int n=30;
		pb.fibbonacciSeries(n);
		pb.print();
	}
}
