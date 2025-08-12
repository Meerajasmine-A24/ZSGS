// Get some strings through the command-line prompt and use an array to store and display them.

public class Problem4{
  public static void main(String[]args){
	  if(args.length==0){
		  System.out.println("No string was entered");
	  }
	  
	  String[]strings=args;
	  
	  System.out.println("\nStrings You have entered in command line Arguements are : ");
	  for(String s:strings){
		  System.out.print(s+"  ");
	  }
  }
}