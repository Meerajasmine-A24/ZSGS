// add two binary strings 


import java.util.Scanner;


public class Problem1{
	public static String addBinary(String a,String b){
		int i=a.length()-1;
		int j=b.length()-1;
		int carry=0;
		
		StringBuilder result=new StringBuilder();
		
		while(i>=0 || j>=0 || carry >0){
			int s1 = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int s2 = (j >= 0) ? b.charAt(j--) - '0' : 0;

            int sum = s1 + s2 + carry;
            carry = sum / 2;
            result.append(sum % 2);
        }

        return result.reverse().toString();
    }
	public static void main(String[]args){
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter 1st  binary number containing only 0's & 1's");
		 String a=s.next();
		  System.out.println("Enter 2nd  binary number containing only 0's & 1's");
	     String  b=s.next();
		 System.out.println("The addition of two binary numbers was : "+ addBinary(a,b));
	}
}

		 
		 
		 