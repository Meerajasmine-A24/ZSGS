
public class Problem6{
	public static String record(int[]array,int year){
		int left=0;
		int right=array.length-1;
		while(left<=right){
			int mid=(left+right)/2;
			if(array[mid]==year){
				return "Record Exists";
			}
			else if(array[mid]<year){
			  left=mid+1;
			}  
			else{
				right=mid-1;
			} 
		}
		return "Record Not Exists";
		
	}
	
public static void main(String[]args){
	int[]array={1982, 1987, 1993, 1996, 1999, 2002,2003, 2006, 2007, 2009, 2010, 2016};
	int year1=1996;
	int year2=2004;
	int year3=2010;
	
	System.out.println("In the record array year "+year1+" "+record(array,year1));
	System.out.println("In the record array year "+year2+" "+record(array,year2));
	System.out.println("In the record array year "+year3+" "+record(array,year3));
}
}