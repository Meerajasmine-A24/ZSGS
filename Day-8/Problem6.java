// . Develop a Java program to illustrate pass-by-value.

public class Problem6{
    public static void doubleV(int value){
	      value=2*value;
		  }
		  
	public static void main(String[]args){
		int value=50;
		doubleV(value);
		System.out.println(value);
	}
}

		