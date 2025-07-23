// ages of 10 peoples selection sort 

import java.util.Scanner;

class Ages{
	int[]ages;
	Ages(int[]ages){
		this.ages=ages;
	}
	void selectionSort(){
		for(int i=0;i<10;i++){
			int min=i;
			for(int j=i+1;j<10;j++){
				if(ages[j]<ages[min]){
					min=j;
				}
			}
			int temp=ages[min];
			ages[min]=ages[i];
			ages[i]=temp;
		}
		for(int num:ages){
			System.out.print(num+" ");
		}
	}
}

public class Problem7{
	public static void main(String[]args){
  Scanner s =new Scanner(System.in);
  System.out.println("Enter the weight of 10 ppls :") ;
  int[]ages=new int[10];
  for(int i=0;i<10;i++){
	  ages[i]=s.nextInt();
  }
  Ages age=new Ages(ages);
  age.selectionSort();
}
}

  