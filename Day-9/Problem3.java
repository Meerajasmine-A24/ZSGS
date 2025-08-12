// Write a program to illustrate how to throw a ClassNotFoundException.

public class Problem3{
	public static void main(String[]args){
		try{
			Class.forName("Employee");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}


