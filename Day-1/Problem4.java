// Check two Numbers equal or not without using comparator opearator

import java.util.Scanner;

public class Problem4{
 
 public static boolean isEqual(int a,int b){
    int val=a^b;
	if(val==0) {
		return true;
	}
	return false;
 }
 
 public static void main(String[]args){
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter a number : ");
	 int a=s.nextInt();
	 System.out.println("Enter another number :");
	 int b=s.nextInt();
	 System.out.println("Two Numbers are Equal :" + isEqual(a,b));
	 
 }
}
