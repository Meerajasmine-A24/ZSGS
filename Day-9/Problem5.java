/*  Create a program where try block contains a return statement.
 Ensure that finally block executes before the method returns. Show this with output. */
 
 public class Problem5{
	 public static int tryReturn(int number){
		 try{
			 return number;
		 }
		 finally{
			 System.out.println("Finally block Executed ");
		 }
	 }
	 public static void main(String[]args){
		 int number = 10;
		 System.out.println(tryReturn(10));
		 
	 }
 }