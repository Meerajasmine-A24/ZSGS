// age count of peoples for <18 && 18-60 && >60

import java.util.Scanner;

public class  Problem8{
	public void  weightCount(int[]ages){
		int under18=0;
		int moderate=0;
		int greater60=0;
	for(int i=0;i<10;i++){
	 if(ages[i]<18){
		 under18++;
	 }
	 else if(ages[i]>=18 && ages[i]<60){
		 moderate++;
	 }
	 else{
		 greater60++;
	 }
	}
	System.out.println("count of peoples under 18 are : " +under18);
	System.out.println("count of peoples in range of 18 to 60 are : " +moderate);
	System.out.println("count of peoples above 16  are : " +greater60);
	
	}
	public static void main(String[]args){
		Problem8 pb=new Problem8();
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter ages of 10 people");
	  int[]ages=new int[10];
	  for(int i=0;i<10;i++){
		  ages[i]=s.nextInt();
	  }
	  pb.weightCount(ages);
	  
	}
	  
}

	
	
	 
		