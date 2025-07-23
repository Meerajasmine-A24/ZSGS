 // Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) as function arguments. The function calculates sum of only single digit and sum of only double digit elements from the array. Design a main() function to input size of the array ‘len' and single dimensional array of size 'len',
// and print the required result by invoking the function print( ).

import java.util.Scanner;

class SingleDoubleDigitSum{
	void print(int[]array,int len){
		int singleDt=0;
		int doubleDt=0;
		for(int i=0;i<len;i++){
			if(array[i]>=0 && array[i]<=9){
				singleDt+=array[i];
			}
			else if(array[i]>=10 && array[i]<=99){
				doubleDt+=array[i];
			}
		}
		System.out.println("The Sum of Single Digit Elements in the array was :  " +singleDt );
		System.out.println("The Sum of Double Digit ELements in the array was :  " +doubleDt);
	}
}

public class Problem4{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in); 
		SingleDoubleDigitSum sd=new SingleDoubleDigitSum();
		System.out.println("Enter the length of the array :");
		int len=s.nextInt();
		int[]array=new int[len];
		System.out.println("Enter "+len+ " elements of the array");
		for(int i=0;i<len;i++){
			array[i]=s.nextInt();
		}
		sd.print(array,len);
	}
}

		
		