// s is a subsequence of t

public class Problem5{
	public static boolean isSubSequence(String s,String t){
		int i=0;
		int j=0;
		while(i<s.length() && j<t.length()){
			if(s.charAt(i)==t.charAt(j)){
				i++;
			}
			j++;
		}
		return i==s.length(); 
	}
	
	public static void main(String[]args){
		String s1="abc"; 
		String t1= "ahbgdc";
		
		String s2="axc";
		String t2="ahbgdc";
		
		System.out.println("If" + s1 + " is the subsequence of " + t1+ ": "+isSubSequence(s1,t1));
		System.out.println("If" + s2 + " is the subsequence of " + t2+ ": "+isSubSequence(s2,t2));
	}
}	