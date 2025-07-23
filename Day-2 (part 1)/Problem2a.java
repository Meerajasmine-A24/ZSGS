// pattern printing cross pattern
import java.util.Scanner;
public class Problem2a{
     public static void printPattern(int n){
		 char[][] matrix=new char[n][n];
		 for(int i=0;i<n;i++){
			 for(int j=0;j<n;j++){
				 matrix[i][i]='1';
				 matrix[i][n-1-i]='1';
			 }
		 }
		 for(char [] row:matrix){
			 for(char num:row){
				 System.out.print(num+" ");
			 }
			 System.out.println();
		 }
		 
	 }
	 
	 public static void main(String[]args){
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter number of rows :");
		 
		 int n=s.nextInt();
		 printPattern(n);
	 }
}


				 