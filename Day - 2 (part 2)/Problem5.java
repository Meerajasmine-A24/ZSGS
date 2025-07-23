//  Write a program to initialize the following character arrays and print a suitable message after checking the arrays whether the two arrays are identical or not.
// Make suitable use of Boolean data type

public class Problem5{
	public static boolean isIdentical(char[]x,char[]y){
		if(x.length!=y.length) return false;
		for(int i=0;i<x.length;i++){
			if(x[i]!=y[i]){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[]args){
		char[]x={'m','n','o','p'};
		char[]y={'m','n','o','p'};
	    
		char[]a={'m','n','o','p'};
		char[]b={'m','n','l','p'};
		
	  System.out.println("Two Arrays are identical :  "+isIdentical(x,y));
	   System.out.println("Two Arrays are identical :  "+isIdentical(a,b));
	}
}

	  
		