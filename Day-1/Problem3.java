import java.util.Scanner;

public class Problem3{
	
	public static  int maxTwo(int a,int b){
		return (a>b) ? a:b;
	}

public static void main(String[]args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Number 1: ");
	int a=s.nextInt();
	System.out.println("Enter Number 2: ");
	int b=s.nextInt();
	
	System.out.println("Maximum Among 2 number is : " + maxTwo(a,b));
}
}
  
	