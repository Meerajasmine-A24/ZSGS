//  Develop a Java program which illustrates the usage of Comparator Interface.

import java.util.*;

public class Problem2{
	
	// sorting the numbers  in ascending order based on their last digit 
	
	public static  List<Integer> sortNum(List<Integer> nums){
		Comparator<Integer> com=new Comparator<>(){
		public int compare(Integer i, Integer j)
		  {
			if(i%10>j%10) return 1;
			else return -1;
		  }
		};
		Collections.sort(nums,com);
		return nums; 
	} 
	
	// sorting the string array based on their length 
	
	public static String[] sortNames(String[]array){
		Comparator<String> com=new Comparator<>(){
			public int compare(String i,String j)
			{
				if(i.length()>j.length()) return 1;
				else return -1;
			}
		};
		Arrays.sort(array,com);
		return array;
	}
	
		public static void main (String[]args){
			
		List<Integer> nums=new ArrayList<>(Arrays.asList(12,56,789,54,232,231,330));
		System.out.println(sortNum(nums));
		String[]array={"Meera","Jasmine","Paris","Zoho","WaterMelon"};
		array=sortNames(array);
		for(String s:array){
			System.out.print(s+" , ");
		}		
	}
}
