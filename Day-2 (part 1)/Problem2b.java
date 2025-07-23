// pattern printing - R

public class Problem2b{
	public static void printPatternR(){
		int k=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=4;j++){
		if((i==1) || ( j==1 )|| (i==3) || (j==4 &&  i<=2) || (i+j==k)){
			System.out.print("R");
		}
		else{
			System.out.print(" ");
			
		}
		
			}
			k+=2;
			System.out.println();
		} 
	
		
	}
	public static void main(String[]args){
		printPatternR();
	}
}
