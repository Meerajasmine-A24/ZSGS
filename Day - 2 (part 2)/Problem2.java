// Write a program to take in 10 values and print only those numbers which are prime.

import java.util.Scanner;

public class Problem2{
	public void primeNumbers(int[]array){
		System.out.println("The Prime Numbers in the array are:");
		for(int i=0;i<array.length;i++){
			if(isPrime(array[i])){
				System.out.print(array[i]+" ");
			}
		}
	}
	public static boolean isPrime(int n){
		if(n<2) return false;
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		Problem2 obj=new Problem2();
		Scanner s=new Scanner(System.in);
		int[]array=new int[10];
		System.out.println("Enter 10 numbers to store in the array:");
		for(int i=0;i<10;i++){ 
			array[i]=s.nextInt();
		}
	   System.out.print("The array  was :  ");
	   for(int num:array){
		   System.out.print(num+" ");
	   }
	   System.out.println();
	   obj.primeNumbers(array);
	   
	}
	
}
			
	