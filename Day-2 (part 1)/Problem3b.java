// pattern printing - > w using while loop

public class Problem3b{
 public static void main(String[]args){
	 
	/* for(int i=0;i<5;i++){
		 int end = (i<3)?i:5-i-1;
		 for(int j=0;j<=end;j++){
			
			 System.out.print("W ");
			 
			 
		 }
		 System.out.println();
	 } */
	 
 
 int i=0;
 while(i<5){
	 int end = (i<3)?i:5-i-1;
	 int j=0;
	 while(j<=end){
	 System.out.print("W ");
	 j++;
	 }
	 i++;
	 System.out.println();	 
}
 }
}