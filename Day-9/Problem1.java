/* int[] arr = {2, 5, 1, 4, 0, 7};
int quotient = arr[7] / arr[4];
Develop a Java program which handles any unexpected situations that may arise during execution.*/

public class Problem1{
	public static void main(String[]args){
		int[]arr={2,5,1,4,0,7};
		try{
			int quotient=arr[7]/arr[4];
			System.out.println(quotient);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index out of bound Exception caught  ");
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e){
			System.out.println("Cannot Divisible By Zero ");
			System.out.println(e.getMessage());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
		