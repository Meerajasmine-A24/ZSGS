// Pattern Printing - Zoho corporations

public class Problem4b{
    public void pattern(String s){
		int n=4;
		char[][]matrix=new char[n][n];
		int ind=0;
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				 matrix[i][j]=s.charAt(ind++);
			}
		}
		
		for(char[]row:matrix){
			for(char ch:row){
				System.out.print(ch+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[]args){
		Problem4b obj=new Problem4b();
	     String s="ZOHOCORPORATIONS";
		 obj.pattern(s);
	}
}

				
		
