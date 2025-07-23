// Integer array of 10 elements - and sum of all odd numbers
import java.util.Scanner;

public class Problem1{
	public  int sum(int[]array){
		int sum=0;
		for(int i=0;i<10;i++){
			if(array[i]%2!=0){
				sum+=array[i];
			}
		}
		return sum;
	}
	
	public static void main(String[]args){
		Problem1 pb=new Problem1();
		Scanner s=new Scanner(System.in);
		int[]array=new int[10];
		System.out.println("Enter 10 numbers to store in the array:");
		for(int i=0;i<10;i++){ 
			array[i]=s.nextInt();
		}
	   System.out.print("The matrix was :  ");
	   for(int num:array){
		   System.out.print(num+" ");
	   }
	   System.out.println();
	   
	   System.out.println("The sum of odd values in the matrix are :" + pb.sum(array));
	   
	   
	}
}

	
		
				